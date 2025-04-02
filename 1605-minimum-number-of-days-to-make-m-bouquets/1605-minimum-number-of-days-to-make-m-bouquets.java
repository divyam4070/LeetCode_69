class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;
        for(int i:bloomDay){
            if(l>i){
                l=i;
            }
            if(r<i){
                r=i;
            }
        }
       
        while(l<r){
            int mid = l+(r-l)/2;
    
           
            if(getBouquetCount(bloomDay, k, mid)>=m){
                r = mid;
            }

            else{
                l = mid+1;
            }
        }
        return l;
    }
      private int getBouquetCount(int[] bloomDay, int k, int waitingDays) {
    int bouquetCount = 0;
    int requiredFlowers = k;
    for (final int day : bloomDay)
      if (day > waitingDays) {
        // Reset `requiredFlowers` since there was not enough adjacent flowers.
        requiredFlowers = k;
      } else if (--requiredFlowers == 0) {
        // Use k adjacent flowers to make a bouquet.
        ++bouquetCount;
        requiredFlowers = k;
      }
    return bouquetCount;
  }
}
