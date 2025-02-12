class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxSum = -1; 
        for (int num : nums) {
            int digitSum = getSum(num);
            if (map.containsKey(digitSum)) {
                maxSum = Math.max(maxSum, map.get(digitSum) + num);
                map.put(digitSum, Math.max(map.get(digitSum), num));
            } else {
                map.put(digitSum, num);
            }
        }
        return maxSum;
    }

    public static int getSum(int element) {
        int sum = 0;
        while (element > 0) {
            sum += element % 10;
            element /= 10;
        }
        return sum;
    }
}
