package problem5.adt;

public interface adt<E> {
    public void enqueue(E data);

    public E dequeue();

    public E peek();

    public boolean isEmpty();

    public int getsize();
}
