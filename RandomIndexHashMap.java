class Solution {
    // hrr element ke saath saare posssible index put krdie random function use krkre random index ka element return kr dia .
    HashMap<Integer,List<Integer>> map;
    public Solution(int[] nums) {
        map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            List<Integer> list=map.getOrDefault(nums[i],new ArrayList<>());
            list.add(i);
            map.put(nums[i],list);
        }
    }
    public int pick(int target) {
        List<Integer> ans=map.get(target)   ;
        int length=ans.size();
        int index=(int)(Math.random()*length);
        return ans.get(index);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */
