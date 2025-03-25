class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
        int l=0;
        int r = n;
        for(int i=0;i<res.length; i++){
            if(i%2==0){
                res[i]=nums[l];
                l++;
            }
            else{
                res[i]=nums[r];
                r++;
            }
        }
        return res;
    }
}