import java.util.LinkedList;
public class CollectionLink {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(0);
        list.addLast(20);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
    }
}
