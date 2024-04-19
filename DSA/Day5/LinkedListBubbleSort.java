class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListBubbleSort {
    public static ListNode bubbleSort(ListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        boolean swapped;
        do {
            swapped = false;
            ListNode prev = null;
            ListNode current = head;
            ListNode nextNode = head.next;

            while (nextNode != null) {
                if (current.val > nextNode.val) {
                    // Swap current and nextNode
                    if (prev != null) {
                        prev.next = nextNode;
                    } else {
                        head = nextNode;
                    }
                    current.next = nextNode.next;
                    nextNode.next = current;
                    swapped = true;
                }
                prev = current;
                current = current.next;
                nextNode = nextNode.next;
            }
        } while (swapped);

        return head;
    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.println("Linked list before sorting:");
        printList(head);
        head = bubbleSort(head);
        System.out.println("Linked list after sorting:");
        printList(head);
    }
}
