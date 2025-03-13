import java.util.*;

class Solution {
    public List<List<Long>> splitPainting(int[][] segments) {
        List<List<Long>> l = new ArrayList<>();
        Map<Integer, Long> h = new HashMap<>();
        
        // Mark the start and end of each segment
        for (int[] segment : segments) {
            h.put(segment[0], h.getOrDefault(segment[0], 0L) + segment[2]); // Add paint
            h.put(segment[1], h.getOrDefault(segment[1], 0L) - segment[2]); // Remove paint
        }

        // Extract keys and sort them
        List<Long> keys = new ArrayList<>();
        for (int key : h.keySet()) {
            keys.add((long) key);
        }
        Collections.sort(keys);

        List<Long> innerList;
        long prev = keys.get(0);
        long sum = 0;

        for (long curr : keys) {
            if (sum > 0) {
                innerList = new ArrayList<>();
                innerList.add(prev);
                innerList.add(curr);
                innerList.add(sum);
                l.add(innerList);
            }
            sum += h.getOrDefault((int) curr, 0L); // Safely retrieve values
            prev = curr;
        }

        return l;
    }
}
