public class LinkShraddha {
    static Node head;
    static Node tail;
    static int size;
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null)
        {
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public void addAtIndex(int data,int index){
        Node newNode =new Node(data);
        if(index<0 || index>size){
            return;
        }
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size-1){
            addLast(data);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
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
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node secondLast=head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            secondLast=secondLast.next;
            lastNode=lastNode.next;
        }
        secondLast.next=null;
        tail=secondLast;
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data+" -> ");
            temp=temp.next;
        }


    }
    public int getSize(){
        Node temp=head;
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;

        }
        return size;
    }
    public boolean isFound(int data){
        Node temp=head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public  boolean recursiveFound(int data,Node head)
    {
        if(head==null){
            return false;
        }
        if(head.data==data){
            return true;
        }
        return recursiveFound(data, head.next);
    }
    public void reverseLinkedList(){
        Node currNode=head;
        Node prev=null;
        Node next;
        while(currNode!=null){
            next=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=next;
        }

    }
    public void removeNth(int n){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        int iTofind=size-n;
        Node temp=head;
        int i=0;
        while(i<iTofind){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return;
    }
    public Node  getMidNode(Node head){// to get second half ka first node 
        if(head==null|| head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;

    }
    public Node getMid(Node head){// to get first half ka second node
        if(head==null){
            return null;
        }
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public boolean isPalindrome(Node head){
        if(head==null || head.next==null){
            return true;
        }
        Node midNode=getMidNode(head);
        Node prev=null;
        Node next;
        while(midNode!=null){
            next=midNode.next;
            midNode.next=prev;
            prev=midNode;
            midNode=next;
        }
        Node left=head;
        Node right=prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
                
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
    public boolean isCycyle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public Node removeCycle(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node slow=head;
        Node fast=head;
        boolean isCycle=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                isCycle=true;
                break;
            }
        }
        if(!isCycle){
            return null;
        }
        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        return prev.next=null;

    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node mid=getMid(head);
        Node right=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(right);
        return merge(newLeft,newRight);
    }
    public Node merge(Node left,Node right){
        Node merge=new Node(-1);
        Node temp=merge;
        while(left!=null && right!=null){
            if(left.data<=right.data){
                temp.next=left;
                left=left.next;
                temp=temp.next;
            }
            else{
                temp.next=right;
                right=right.next;
                temp=temp.next;
            }
        }
        while(left!=null){
            temp.next=left;
            left=left.next;
            temp=temp.next;
        }
        while(right!=null){
            temp.next=right;
            right=right.next;
            temp=temp.next;
        }
        return temp.next;
    }
    public void ZigZg(){
        Node mid=getMid(head);
        Node currNode=mid.next;
        Node prev=null;
        Node next;
        while(currNode!=null){
            next=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=next;
        }
        Node nextL;
        Node nextR;
        Node leftHead=head;
        Node rightHead=prev;
        while(leftHead!=null && rightHead!=null){
            nextL=leftHead.next;
            leftHead.next=rightHead;
            nextR=rightHead.next;
            rightHead.next=nextL;
            
            leftHead=nextL;
            rightHead=nextR;
        }
    }
    public Node interSectedNode(Node head1,Node head2){
        Node tempA=head1;
        Node tempB=head2;
        while(tempA!=null){
            while(tempB!=null){
                if(tempA.data==tempB.data){
                    return tempA;
                }
                tempB=tempB.next;
            }
            tempB=head2;
            tempA=tempA.next;
        }
        return null;
    }
    public Node reverseII(Node head, int left,int right){
        Node temp=new Node(0);
        temp=temp.next;

        Node leftNode=temp;
        Node currNode =head;
        for(int i=0;i<=left-1;i++){
            leftNode=leftNode.next;
            currNode=currNode.next;
        }
        Node subNode=currNode;
        Node prev=null;
        for(int i=0;i<=right-left;i++){
            Node next=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=next;
        }
        leftNode.next=prev;
        subNode.next=currNode;
        return temp.next;

    }
    public Node swapNodes(Node head,int k){
        if(k<1|| head==null){
            return head;
        }
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        Node firstNode=null;
        Node secodNode=null;
        // int Size=0;
        Node temp1=head;
        for(int i=1;i<k;i++){
            temp1=temp1.next;

        }
        firstNode=temp1;
        Node temp2=head;
        for(int i=1;i<size-k;i++){
            temp2=temp2.next;
            

        }
        secodNode=temp2;

        int t=firstNode.data;
        firstNode.data=secodNode.data;
        secodNode.data=t;

        return head;
    }
    public void deleteNode(Node node)
    {
        node.data=node.next.data;
        node.next=node.next.next;
    }

    public void deleteMiddle(Node head){
        if(head==null|| head.next==null){
            return;
        }
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        if(slow!=null)
        {
            slow.next=slow.next.next;
        }
        else
        {
            head=head.next;
        }
        return ;
    }
    public int pairSum(Node head){
        Node midNode=getMidNode(head);
        Node prev=null;
        Node currNode=midNode;
        while(currNode!=null){
            Node next=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=next;
        }
        Node right=prev;
        Node left=head;
        int M=0;
        while(left!=right){
            int sum=left.data+right.data;
            M=Math.max(M,sum);
            left=left.next;
            right=right.next;
        }
        return M;
    }
    public Node mergeinBetween(Node list1,Node list2, int a,int b){
        Node temp=list1;
        for(int i=0;i<a-1;i++){
            temp=temp.next;
        }
        Node startList=temp;
        for(int i=0;i<b-a+1;i++){
            temp=temp.next;
        }
        Node endList=temp.next;
        startList.next=list2;
        Node t=list2;
        while(t.next!=null){
            t=t.next;
        }
        t.next=endList;
        return list1;
    }
    


    public static void main(String[] args) {
        
    }
    
}
