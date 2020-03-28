/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;


import problem3.adt.adt;
import problem3.node.Node;

public class MyPriorityQueue<E> implements adt<E> {
    private int size = 0;
    private Node<E> front;
    private Node<E> rear;

    private Node<E> getNode(int index) {
        Node<E> response = front;
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else {
            for (int i = 1; i < index && front != null; i++) {
                response = response.getNext();

            }
        }
        return response;
    }

    @Override
    public void add(E data) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E peek() {
        return null;
    }

    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder("[");
        Node<E> temp = front;
        for (int i = 0; i < size && temp != null; i++) {
            E data = temp.getData();
            stringBuilder.append(data);
            stringBuilder.append((i < size - 1) ? "," : "");
            temp = temp.getNext();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
