import java.util.concurrent.atomic.AtomicInteger;

public class Asiakas {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private long start, end;

    public Asiakas(){
        this.id = count.incrementAndGet();
        this.start = System.currentTimeMillis();
    }

    public void setId() {
        this.id = count.incrementAndGet();
    }

    public void setStart() {
        this.start = System.currentTimeMillis();
    }

    public void setEnd() {
        this.end = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public long getStart() {
        return start;
    }

    public long getEnd() {
        return end;
    }

    public long time(){
        return this.end-this.start;
    }
}
