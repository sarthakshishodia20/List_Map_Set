import java.util.*;
public class CountDistinctElementHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        int[] nums={2,2,3,4,5,5,6,7,8,9,5,3,2,4,5,6,7,8,2,5,64,64,46,666,45,6422614,2};
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        System.out.println(set.size());
        System.out.println(set);
    }
    
}
