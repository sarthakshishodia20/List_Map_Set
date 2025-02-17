import java.util.*;

public class Solution {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = A.size();

        while (j < n) {
            map.put(A.get(j), map.getOrDefault(A.get(j), 0) + 1);

            if ((j - i + 1) > B) {
                while ((j - i + 1) > B) {
                    map.put(A.get(i), map.get(A.get(i)) - 1);
                    if (map.get(A.get(i)) == 0) {
                        map.remove(A.get(i));
                    }
                    i++;
                }
            }

            if ((j - i + 1) == B) {
                list.add(map.size());
            }

            j++;
        }
        return list;
    }
}
