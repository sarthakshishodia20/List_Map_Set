import java.util.HashSet;

public class HashSetImp {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(2);
        set.add(10);
        set.add(90);
        set.add(40);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains(3));
        set.clear();
        System.out.println(set);
    }
    
}
