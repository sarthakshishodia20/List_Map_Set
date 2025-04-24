class Solution {
    public long[] distance(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];
            if (map.containsKey(element)) {
                map.get(element).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(element, list);
            }
        }
        ArrayList<Long> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int valueHai = nums[i];
            ArrayList<Integer> indexes = map.get(valueHai);
            long sum = 0;
            for (int ele : indexes) {
                sum += Math.abs(ele - i);
            }
            ans.add(sum);
        }
        long[] result = new long[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
