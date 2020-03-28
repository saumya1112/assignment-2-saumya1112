package problem3.adt;

public interface adt<E> {
    void add(E data);

    E remove();

    E peek();
}
