public class DoubleLinkList {
    public Node head;
    public Node tail;
    public int size;

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node currNode = head;
        Node prev = null;
        Node next;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prev;
            currNode.prev = next;
            prev = currNode;
            currNode = next;
        }
        head = prev;
    }

    public void addInside(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid position");
            return;
        }
        if (index == 0) {
            addFirst(data);
        } else if (index == size) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
            size++;
        }
    }

    public void deleteInside(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid position");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public static void main(String[] args) {
        DoubleLinkList list = new DoubleLinkList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addLast(20);
        list.addLast(21);
        list.print();
        list.removeFirst();
        list.removeFirst();
        System.out.println("Size: " + list.size());
        list.reverse();
        list.print();
        list.addInside(100, 2);
        list.print();
        list.deleteInside(2);
        list.print();
    }
}
