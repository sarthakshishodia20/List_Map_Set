public class IntersectionOfTwoLinked {
    class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static ListNode intersection(ListNode head1, ListNode head2) {
        ListNode tempA = head1;
        ListNode tempB = head2;

        while (tempA != null) {
            while (tempB != null) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempB = tempB.next;
            }
            tempB = head2;
            tempA = tempA.next;
        }
        return null;
    }

    public static void main(String[] args) {
        IntersectionOfTwoLinked intersectionOfTwoLinked = new IntersectionOfTwoLinked();

        // Create linked list 1
        ListNode head1 = intersectionOfTwoLinked.new ListNode(1);
        head1.next = intersectionOfTwoLinked.new ListNode(2);
        head1.next.next = intersectionOfTwoLinked.new ListNode(3);
        head1.next.next.next = intersectionOfTwoLinked.new ListNode(4);
        ListNode intersectionNode = head1.next.next.next;

        // Create linked list 2
        ListNode head2 = intersectionOfTwoLinked.new ListNode(8);
        head2.next = intersectionOfTwoLinked.new ListNode(7);
        head2.next.next = intersectionNode; // Making it intersect with the previous list

        // Print the output
        System.out.println("Linked List 1:");
        printLinkedList(head1);
        System.out.println("\nLinked List 2:");
        printLinkedList(head2);
        System.out.println();
        ListNode a=intersection(head1,head2);
        System.out.println(a.data);
    }

    // Method to print the linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
    }
}

