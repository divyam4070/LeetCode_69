import java.util.HashMap;

class Solution {
    public int beautySum(String s) {
        int l = s.length();
        int sum = 0;

        // Iterate over all possible starting points of substrings
        for (int i = 0; i < l; i++) {
            HashMap<Character, Integer> h = new HashMap<>(); // Clear the map for each starting point

            // Iterate over all possible ending points of substrings
            for (int j = i; j < l; j++) {
                // Add the current character to the map
                h.put(s.charAt(j), h.getOrDefault(s.charAt(j), 0) + 1);

                // Calculate max and min frequencies
                int max = Integer.MIN_VALUE;
                int min = Integer.MAX_VALUE;

                for (Integer values : h.values()) {
                    min = Math.min(min, values);
                    max = Math.max(max, values);
                }

                // Only add to sum if we have valid min and max
                if (max != Integer.MIN_VALUE && min != Integer.MAX_VALUE) {
                    sum += max - min;
                }
            }
        }

        return sum;
    }
}