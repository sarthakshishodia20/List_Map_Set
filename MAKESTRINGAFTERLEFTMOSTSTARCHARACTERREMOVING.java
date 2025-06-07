class Solution {
    public String clearStars(String s) {
     HashMap<Character,ArrayList<Integer>> map=new HashMap<>();
     PriorityQueue<Character> pq=new PriorityQueue<>();
     boolean[] marked=new boolean[s.length()];
     Arrays.fill(marked,true);
     for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch!='*'){
            pq.add(ch);
            if(map.containsKey(ch)){
                map.get(ch).add(i);
            }
            else{
                ArrayList<Integer> indices=new ArrayList<>();
                indices.add(i);
                map.put(ch,indices);
            }
        }
        else{
            char smallest=pq.poll();
            ArrayList<Integer> index=map.get(smallest);
            marked[i]=false;
            marked[index.get(index.size()-1)]=false;
        }
     }
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(marked[i]==true){
            sb.append(s.charAt(i));
        }
     }
     return sb.toString();
    }
}
