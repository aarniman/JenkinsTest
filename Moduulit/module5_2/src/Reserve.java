import java.util.concurrent.atomic.AtomicInteger;

public class Reserve {
    private int totalSeats;
    private AtomicInteger remainingSeats;

    public Reserve(int totalSeats) {
        this.totalSeats = totalSeats;
        this.remainingSeats = new AtomicInteger(totalSeats);
    }

    public synchronized boolean reserveSeats(int seats) {
        if (seats > 0 && seats <= remainingSeats.get()) {
            remainingSeats.getAndAdd(-seats);
            System.out.println(Thread.currentThread().getName() + " reserved " + seats + " seats.");
            return true;
        }
        return false;
    }

    public int getRemainingSeats() {
        return remainingSeats.get();
    }
}

class CustomerThread extends Thread {
    private Reserve reserve;
    private int seats;

    public CustomerThread(String name, Reserve reserve, int seats) {
        super(name);
        this.reserve = reserve;
        this.seats = seats;
    }

    @Override
    public void run() {
        if (reserve.reserveSeats(seats)) {
            System.out.println(Thread.currentThread().getName() + " reserved " + seats + " seats.");
        } else {
            System.out.println(Thread.currentThread().getName() + " could not reserve " + seats + " seats.");
        }
    }
}

class Main{
    public static void main(String[] args){
        int totalSeats = 10;
        Reserve reserve = new Reserve(totalSeats);

        Thread[] customers = new Thread[20];
        for (int i = 0; i < 20; i++) {
            customers[i] = new CustomerThread("Customer " + (i + 1), reserve, (int) (Math.random() * 5) + 1);
            customers[i].start();
        }

        for (int i = 0; i < 20; i++) {
            try {
                customers[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All customers finished.");
    }
}
