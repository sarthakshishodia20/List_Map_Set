class Solution {
    // Saare character ke indexes arraylist mei store krlie and then hrr character ka size check krte gye arraylist ke size se available agr hai hi nahi toh return 0 otherwise divide krdo utne character hmko chahiye honge target String bnane ke liye
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            List<Integer> indices = map.getOrDefault(ch, new ArrayList<>());
            indices.add(i);
            map.put(ch, indices);
        }
        HashMap<Character, Integer> targetCount = new HashMap<>();
        for (char c : target.toCharArray()) {
            targetCount.put(c, targetCount.getOrDefault(c, 0) + 1);
        }
        int minRearranges = Integer.MAX_VALUE;
        for (char c : targetCount.keySet()) {
            if (!map.containsKey(c)) {
                return 0;
            }
            int availableCount = map.get(c).size();
            int requiredCount = targetCount.get(c);
            minRearranges = Math.min(minRearranges, availableCount / requiredCount);
        }
        return minRearranges;
    }
}
