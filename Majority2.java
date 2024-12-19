class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int frequency=entry.getValue();
            int element=entry.getKey();
            if(frequency>(n/3)){
                list.add(element);
            }
        }
        return list;
    }
}
