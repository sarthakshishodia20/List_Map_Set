import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetTypes {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(5);


        System.out.println(set);

        LinkedHashSet<Integer> lset=new LinkedHashSet<>();
        
        lset.add(1);
        lset.add(2);
        lset.add(4);
        lset.add(5);
        System.out.println(lset);

        TreeSet<Integer> tset=new TreeSet<>();
        
        tset.add(1);
        tset.add(2);
        tset.add(4);
        tset.add(5);


        System.out.println(tset);
    }
    
}
