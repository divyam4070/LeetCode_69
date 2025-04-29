class Solution {
    public void nextPermutation(int[] nums) {
        //step1 find the longesst non increasing suffix
        int n = nums.length;
        int pivot = n-2;
        while(pivot>=0 && nums[pivot]>=nums[pivot+1]){
            pivot--;
        }
        //step2 
        if(pivot>=0){
            int j = n-1;
            while(nums[j]<=nums[pivot]){
                j--;
            }
            int temp = nums[pivot];
            nums[pivot] = nums[j];
            nums[j] = temp;

        }
        while(pivot+1<n-1){
            int temp = nums[pivot+1];
            nums[pivot+1] = nums[n-1];
            nums[n-1]  = temp;
            pivot++;
            n--;
        }

        }
    }
