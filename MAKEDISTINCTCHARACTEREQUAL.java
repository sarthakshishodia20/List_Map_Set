class Solution {
    public boolean isItPossible(String word1, String word2) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            for (char c2 = 'a'; c2 <= 'z'; c2++) {
                if (!map1.containsKey(c1) || !map2.containsKey(c2)) continue;
                Map<Character, Integer> copy1 = new HashMap<>(map1);
                Map<Character, Integer> copy2 = new HashMap<>(map2);
                copy1.put(c1, copy1.get(c1) - 1);
                if (copy1.get(c1) == 0) copy1.remove(c1);
                copy2.put(c2, copy2.get(c2) - 1);
                if (copy2.get(c2) == 0) copy2.remove(c2);
                copy1.put(c2, copy1.getOrDefault(c2, 0) + 1);
                copy2.put(c1, copy2.getOrDefault(c1, 0) + 1);
                if (copy1.size() == copy2.size()) {
                    return true;
                }
            }
        }
        return false;
    }
}
