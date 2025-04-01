class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int big_pile = 0;

        for (int i : piles) {
            if (i > big_pile) {
                big_pile = i;
            }
        }
        // System.out.print(big_pile);

        int high = big_pile;
        int low = 1;

        while (low < high) {

            int mid = (low + high) / 2;
            int hours = 0;
            for (int i : piles) {
                int ceilValue = (int) Math.ceil((double) i / mid);
                hours += ceilValue;
            }
            if (hours > h) {
                low = mid + 1;
            } else {
                high = mid;
            }

        }

        return low;
    }
}
