class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long res = 0;
        long x = 0;
        for(int r=0, l=0;r<nums.length; r++){
            if(nums[r]==0){
                x++;
            }
            else{
                res+= (x*(x+1))/2;
                x=0;
            }
            
        }
        res+= (x*(x+1))/2;
        return res;
    }
}