import java.util.LinkedList;

public class Deque<T> {
    private LinkedList<T> deque;

    public Deque() {
        deque = new LinkedList<>();
    }

    public void addFirst(T item) {
        deque.addFirst(item);
    }

    public void addLast(T item) {
        deque.addLast(item);
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.removeFirst();
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.removeLast();
    }

    public T peekFirst() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.getFirst();
    }

    public T peekLast() {
        if (isEmpty()) {
            throw new IllegalStateException("Deque is empty");
        }
        return deque.getLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public int size() {
        return deque.size();
    }

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<>();
        deque.addFirst(1);
        deque.addLast(2);
        deque.addLast(3);

        System.out.println("Deque size: " + deque.size());
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        System.out.println("Removing elements from the front:");
        while (!deque.isEmpty()) {
            System.out.println(deque.removeFirst());
        }
    }
}
