class Solution {
    public int minSteps(String s, String t) {
        // Same As Min No. Steps in Anagram I Cunt freq and subtract them after removing
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) - 1);
        }
        int count = 0;
        for (int val : freq.values()) {
            count += Math.abs(val);
        }
        return count;
    }
}
