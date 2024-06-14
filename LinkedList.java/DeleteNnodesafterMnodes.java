public class DeleteNnodesafterMnodes {
    
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    static Node linkdelete(Node head, int M, int N) {
        Node temp = head;
        while (temp != null) {
            // Skip M nodes
            for (int i = 1; i < M && temp != null; i++) {
                temp = temp.next;
            }

            // If we reached the end of the list before finding M nodes, stop
            if (temp == null) {
                break;
            }

            // Delete N nodes after M nodes
            Node deleteStart = temp.next;
            for (int i = 0; i < N && deleteStart != null; i++) {
                deleteStart = deleteStart.next;
            }
            temp.next = deleteStart;
            temp = deleteStart;
        }
        return head;
    }
    
    public static void main(String[] args) {
        // Example usage
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        
        System.out.println("Original list:");
        printList(head);
        
        int M = 2;
        int N = 1;
        head = linkdelete(head, M, N);
        
        System.out.println("List after deleting N nodes after every M nodes:");
        printList(head);
    }
    
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
