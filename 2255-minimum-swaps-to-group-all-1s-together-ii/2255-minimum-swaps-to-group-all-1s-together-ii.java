class Solution {
    public int minSwaps(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            count+=nums[i];
        }
        int n_of_zero = 0;
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<nums.length*2; i++){
            if(nums[i%nums.length]==0){
                n_of_zero++;
            }
            if(i>=count  && nums[(i-count)%nums.length]==0){
                n_of_zero--;
            }
            if(i>=count){
            res = Math.min(n_of_zero,res);}
        }



        return res;
        
    }
}