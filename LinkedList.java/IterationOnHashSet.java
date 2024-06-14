import java.util.HashSet;
import java.util.Iterator;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("bangalore");
        set.add("chennai");
        set.add("Firozobad");
        set.add("Khurja");
        set.add("Delhi");
        set.add("Lucknow");

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }




        System.out.println();
        System.out.println();


        for(String city:set){
            System.out.println(city);
        }
    }
    
}
