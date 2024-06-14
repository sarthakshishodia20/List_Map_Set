import java.util.ArrayList;
import java.util.HashSet;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1={7,3,9};
        int[] arr2={6,3,4,2,1,9,7,8,5,0};
        HashSet<Integer> set=new HashSet<>();

        ArrayList<Integer> list=new ArrayList<>();
        // Union of two arrays

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            set.add(arr2[i]);
        }
        System.out.println("Union hai ye");
        
        for(int i: set){
            System.out.print(i+" ");
        }
        System.out.println();
        list.clear();
        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                list.add(arr2[i]);
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection hai ye ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

    }
    
}
