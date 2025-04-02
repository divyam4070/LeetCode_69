class Solution {
    private boolean isValid(int[] bloomDay, int m, int k, int day) {
        int count = 0, noOfbouquets = 0, n = bloomDay.length;

        for(int i = 0; i < n; i++) {
            if(bloomDay[i] <= day) {
                count++;
                if(count == k) {
                    noOfbouquets++;
                    count = 0;
                    if(noOfbouquets == m) {
                        return true;
                    }
                }
            }else {
                count = 0;
                if(n - i < (m - noOfbouquets) * k) {
                    return false;
                }
            }
        }
        return false;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length < (long)k * m) return -1;

        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;

        for(int day : bloomDay) {
            if(day > r) r = day;
            if(day < l) l = day;
        }

        while(l <= r) {
            int mid = l + (r-l)/2;

            if(isValid(bloomDay, m, k, mid)) r = mid-1;
            else l = mid + 1;
        }

        return l;
    }
}