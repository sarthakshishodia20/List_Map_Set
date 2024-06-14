import java.util.HashMap;

public class HashMapOperation {
    public static void main(String[] args) {
        // Create a HashMap in java

        HashMap<String ,Integer> map=new HashMap<>();
        // Put function    TC: 0(1);
        map.put("India",200);
        map.put("China",150);
        map.put("Sri Lanka", 100);
        map.put("Nepal", 20);
        System.out.println(map);

        // Get Function    TC: 0(1);
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));

//       containsKey method    TC: 0(1);
        System.out.println(map.containsKey("India"));

        //  remove
        System.out.println(map.remove("India"));
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        // System.out.println(map.clear());
        map.clear();
        System.out.println(map);

    }
    
}
