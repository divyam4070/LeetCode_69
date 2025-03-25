class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int  k = 0;

        for(int i= 0; i<nums.length; i=i+2){
            res[i] = nums[k];
            res[i+1] = nums[n+k];
            k++;
        }
        return res;
    }
}