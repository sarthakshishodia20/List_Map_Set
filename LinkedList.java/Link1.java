public class Link1 {
    public static Node head;
    public static Node tail;
    static int size;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public void addMiddle(int index,int data){
        Node newNode=new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1){
            i++;
            temp=temp.next;

        }
        if(temp==null){
            System.out.println("Index out of bound");
            return;
        }
        newNode.next=temp.next;

        temp.next=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }
    public void removeLast(){
        if(size==0){
            System.out.println("List is empty");
            return;
        }
        else if(size==1){
            head=tail=null;
            return;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        prev.next=null;
        tail=prev;  
    }
    public static int Size(){
        Node temp=head;
        // int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
        
    }
    public static int LinearSearch(int value){
        Node temp=head;
        int i=0;
        while(temp!=null){

            if(temp.data==value){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Link1 list = new Link1();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(3);
        list.addLast(40);

        // Printing the elements of the linked list
        list.print();
        System.out.println("Size of linked list is "+ Size());
        System.out.println(LinearSearch(3));
        System.out.println(LinearSearch(200));
        }
    }

