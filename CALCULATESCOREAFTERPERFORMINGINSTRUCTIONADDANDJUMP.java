class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        long score = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < instructions.length; i++) {
            map.put(i, false);
        }
        int i = 0;
        int n = instructions.length;
        while (i >= 0 && i < n) {
            if (map.get(i)) {
                break;
            }
            String task = instructions[i];
            if (task.equals("add") && map.get(i) == false) {
                score += values[i];
                map.put(i, true);
                i++;
            } else {
                map.put(i, true);
                int jumpValue = values[i];
                // score -= jumpValue;
                i = i + jumpValue;
            }
        }
        return score;
    }
}
