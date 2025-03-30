class Solution {
    public int minSwaps(int[] nums) {
        if(nums.length == 1 || nums.length == 2){
            return 0;
        }
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==1){
                n++;
            }
        }
        int m = 0;
        int k = 0;
        for(int i = 0; i < 2*nums.length; i++){
            if(i>=n && nums[(i-n)%nums.length]==1){
                m--;
            }
            if(nums[i%nums.length] == 1){
                m++;
            }
            k = Math.max(k, m);
        }



        return n-k;
    }
}