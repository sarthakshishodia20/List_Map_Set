class Solution {
    // Using Heaps and Map Striver Sheet Solutions 
    public static int getSum(int element){
        int sum=0;
        while(element>0){
            sum+=element%10;
            element=element/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int ele:nums){
            int digitSum=getSum(ele);
            if(map.containsKey(digitSum)){
                map.get(digitSum).add(ele);
            }
            else{
                PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
                pq.add(ele);
                map.put(digitSum,pq);
            }
        }
        int Ans = -1;
        for (PriorityQueue<Integer> pq : map.values()) {
            if (pq.size() >= 2) {  
                int maxSum = pq.poll() + pq.poll();
                Ans = Math.max(Ans, maxSum);
            }
        }
        return Ans;
    }
}
