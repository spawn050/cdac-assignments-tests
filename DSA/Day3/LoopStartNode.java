class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Node detectLoopStart() {
        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        // Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return null;
        }

       
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; 
}

public class LoopStartNode {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

      
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

    
        list.head.next.next.next.next.next = list.head.next;

        Node loopStart = list.detectLoopStart();

        if (loopStart != null) {
            System.out.println("The starting node of the loop is: " + loopStart.data);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
