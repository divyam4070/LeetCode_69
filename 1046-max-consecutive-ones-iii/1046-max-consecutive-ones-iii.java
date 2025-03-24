class Solution {
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        for(int l=0, r=0; r<nums.length; r++){

            if(nums[r]==0){
                if(k>0){
                    k--;
                }
                else{
                    while(nums[l]!=0){
                        
                        l++;
                    }
                    l++;
                }

            }
            
            ans = Math.max(ans, r-l+1);
        }
        return ans;
    }
}