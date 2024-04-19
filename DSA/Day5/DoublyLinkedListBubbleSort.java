class DoublyListNode {
    int val;
    DoublyListNode prev;
    DoublyListNode next;

    DoublyListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedListBubbleSort {
    public static DoublyListNode bubbleSort(DoublyListNode head) {
        if (head == null || head.next == null) {
            return head; // Already sorted or empty list
        }

        boolean swapped;
        do {
            swapped = false;
            DoublyListNode current = head;
            while (current.next != null) {
                if (current.val > current.next.val) {
                    // Swap current and current.next
                    swap(current, current.next);
                    swapped = true;
                }
                current = current.next;
            }
        } while (swapped);

        // Find new head after sorting
        while (head.prev != null) {
            head = head.prev;
        }
        return head;
    }

    public static void swap(DoublyListNode a, DoublyListNode b) {
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }

    public static void printList(DoublyListNode head) {
        DoublyListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyListNode head = new DoublyListNode(5);
        head.next = new DoublyListNode(3);
        head.next.prev = head;
        head.next.next = new DoublyListNode(7);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyListNode(2);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DoublyListNode(1);
        head.next.next.next.next.prev = head.next.next.next;

        System.out.println("Doubly linked list before sorting:");
        print

