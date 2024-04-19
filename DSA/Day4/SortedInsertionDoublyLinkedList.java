class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void insertSorted(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        if (data < head.data) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        Node current = head;
        while (current != null && current.data < data) {
            current = current.next;
        }

        if (current == null) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            newNode.prev = current.prev;
            newNode.next = current;
            if (current.prev != null) {
                current.prev.next = newNode;
            } else {
                head = newNode;
            }
            current.prev = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class SortedInsertionDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertSorted(5);
        list.insertSorted(10);
        list.insertSorted(7);
        list.insertSorted(3);
        list.insertSorted(8);

        System.out.println("Sorted Doubly Linked List:");
        list.display();
    }
}
