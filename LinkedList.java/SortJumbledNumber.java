class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int[] arr = new int[nums.length];
        int k = 0;
        for(int j = 0 ; j < nums.length ; j++){
            String str = nums[j] + "";
            String nstr = "";
            for(int i = 0 ; i < str.length() ; i++){
                nstr += mapping[str.charAt(i) - '0'];
            }
            int no = Integer.parseInt(nstr);
            pq.add(new Pair(j , no));
        }
        while(pq.size() != 0){
            Pair current = pq.poll();
            arr[k++] = nums[current.index];
        }
        return arr;
    }
    public class Pair implements Comparable<Pair>{
        int index;
        int number;
        public Pair(int index , int number){
            this.index = index;
            this.number = number;
        }
        public int compareTo(Pair p2){
            if(this.number == p2.number) return this.index - p2.index;
            else return this.number - p2.number;
        }
    }
}
