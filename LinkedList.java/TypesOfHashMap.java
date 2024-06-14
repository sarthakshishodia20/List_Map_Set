import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
public class TypesOfHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        // random order
        map.put("china", 200);
        map.put("RCB", 200);
        map.put("CSK", 100);

        System.out.println(map);

        LinkedHashMap<String, Integer> lmap=new LinkedHashMap<>();
        //  Insertion order
        lmap.put("china", 200);
        lmap.put("RCB", 200);
        lmap.put("CSK", 100);

        System.out.println(lmap);

        TreeMap<String , Integer> tmap=new TreeMap<>();
        //  Sorted Order
        tmap.put("china", 200);
        tmap.put("RCB", 200);
        tmap.put("CSK", 100);

        System.out.println(tmap);
    }
    
}
