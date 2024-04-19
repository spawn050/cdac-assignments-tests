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

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position < 1) {
            System.out.println("Invalid position");
        } else if (position == 1) {
            insertAtBeginning(data);
        } else {
            Node current = head;
            int count = 1;
            while (count < position - 1 && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position");
            } else {
                newNode.next = current.next;
                newNode.prev = current;
                if (current.next != null) {
                    current.next.prev = newNode;
                } else {
                    tail = newNode;
                }
                current.next = newNode;
            }
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("List is empty");
        } else if (position < 1) {
            System.out.println("Invalid position");
        } else if (position == 1) {
            deleteAtBeginning();
        } else {
            Node current = head;
            int count = 1;
            while (count < position && current != null) {
                current = current.next;
                count++;
            }
            if (current == null) {
                System.out.println("Invalid position");
            } else if (current == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
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

public class DLL {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(1);
        list.insertAtEnd(3);
        list.insertAtBeginning(0);
        list.insertAtPosition(2, 2);

        System.out.println("Doubly Linked List:");
        list.display();
    }
}

