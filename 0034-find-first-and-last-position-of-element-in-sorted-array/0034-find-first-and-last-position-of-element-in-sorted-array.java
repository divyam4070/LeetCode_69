class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(nums[mid]==target){
                for(int i= mid; i>=0; i--){
                    if(nums[i]==target){
                        low = i;
                    }
                    else{
                        break;
                    }
                }
                for(int i=mid; i<nums.length; i++){
                    if(nums[i]==target){
                        high = i;
                    }
                    else{
                        break;
                    }
                }

                return new int[]{low, high};

            }
            if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return new int[]{-1,-1};
        
    }
}