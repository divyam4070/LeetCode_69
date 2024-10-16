class Solution {
    public int removeDuplicates(int[] nums) {
        // int k = 1;
        int i=0;
        
        for(int k=1; k<nums.length;k++){
            if(nums[i]!= nums[k]){
                nums[i+1] = nums[k];
                i++;
                
                
            }
            
            
        }
        return i+1;
            
        }
    }
