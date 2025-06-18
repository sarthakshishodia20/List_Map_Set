class Solution {
    public int[][] divideArray(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int ele : nums) {
            pq.add(ele);
        }
        List<List<Integer>> result = new ArrayList<>();
        if (pq.size() < 3) return new int[0][0]; 
        while (!pq.isEmpty()) {
            int first = pq.poll();
            int second = pq.poll();
            int third = pq.poll();
            if (third - first > k) {
                return new int[0][0];
            }
            List<Integer> group = new ArrayList<>();
            group.add(first);
            group.add(second);
            group.add(third);
            result.add(group);
        }
        int[][] ans = new int[result.size()][3];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> group = result.get(i);
            for (int j = 0; j < 3; j++) {
                ans[i][j] = group.get(j);
            }
        }
        return ans;
    }
}
