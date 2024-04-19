import java.util.LinkedList;

public class QueueImplementation<T> {
    private LinkedList<T> queue;

    public QueueImplementation() {
        queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.removeFirst();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.getFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        QueueImplementation<Integer> queue = new QueueImplementation<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Front element: " + queue.peek());

        System.out.println("Dequeueing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue());
        }
    }
}

