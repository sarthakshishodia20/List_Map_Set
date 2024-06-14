import java.util.HashMap;
import java.util.Set;

public class IterationOnHashMap {
    public static void main(String[] args) {
        HashMap<String , Integer> map=new HashMap<>();
        map.put("China", 200);
        map.put("India", 1000);
        map.put("Indonesia", 20);
        System.out.println(map);

        Set<String> keys=map.keySet();
        for(String k: keys){
            System.out.println("Key = "+k+" , "+"value = "+map.get(k));

        }
    }
    
}
