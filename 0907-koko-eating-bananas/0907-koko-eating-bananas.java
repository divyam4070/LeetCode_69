class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int high = 0;

        for (int i : piles) {
            if (i > high) {
                high = i;
            }
        }
        if(h == piles.length){
            return high;
        }
        // System.out.print(big_pile);

        // int high = big_pile;
        int low = 1;

        while (low < high) {

            int mid = (low + high) / 2;
            int hours = 0;
            for (int i : piles) {
                int ceilValue = (i+mid-1)/mid;  
                hours += ceilValue;
            }
            if (hours > h) {
                low = mid+1 ;
            } else {
                high = mid;
            }

        }

        return low;
    }
}
