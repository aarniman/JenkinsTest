import java.util.ArrayList;

public class ThreadSafe<E> {
    private final ArrayList<E> list;

    public ThreadSafe() {
        list = new ArrayList<E>();
    }

    public synchronized void add(E element) {
        list.add(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized void remove(E element) {
        list.remove(element);
    }

}
