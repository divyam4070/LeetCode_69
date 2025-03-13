class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum = 0;
        for(int i = 0; i<nums.length; i++){
            sum+=nums[i];
        }
        int s = 0;
        for(int i = 0; i<nums.length;i++){
            sum -= nums[i];
            if(s == sum){
                return i;
            }
            s += nums[i];
            
        }
        return -1;
        
    }
}