public class ThreadSafeTest {
    public static void main(String[] args) {
        final int THREADS = 100;
        final int OPERATIONS = 1000;

        ThreadSafe<String> list = new ThreadSafe<String>();

        Runnable addTask = () -> {
            for (int i = 0; i < OPERATIONS; i++) {
                list.add(Thread.currentThread() + "-" + i);
            }
        };

        Runnable removeTask = () -> {
            for (int i = 0; i < OPERATIONS; i++) {
                list.remove(Thread.currentThread().getName() + "-" + i);
            }
        };

        Thread[] addThreads = new Thread[THREADS];
        Thread[] removeThreads = new Thread[THREADS];

        for (int i = 0; i < THREADS; i++) {
            addThreads[i] = new Thread(addTask);
            removeThreads[i] = new Thread(removeTask);
            addThreads[i].start();
            removeThreads[i].start();
        }

        try{
            for(Thread t : addThreads){
                t.join();
            }
            for(Thread t : removeThreads){
                t.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("List size: " + list.size());
    }
}
