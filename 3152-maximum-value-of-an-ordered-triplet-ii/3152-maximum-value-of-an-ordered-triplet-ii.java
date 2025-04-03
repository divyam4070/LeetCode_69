class Solution {
    public long maximumTripletValue(int[] nums) {

        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];


        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            prefix[i] = max;
            
        }
        max = nums[nums.length-1];
        for(int i=nums.length-1; i>=0; i--){
            if(nums[i]>max){
                max = nums[i];
            }
            suffix[i] = max;
            
        }
        long res = 0;
        for(int j =1; j<nums.length-1; j++){
            res = Math.max(res,(long)(prefix[j-1]-nums[j]) * suffix[j+1]);
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(Arrays.toString(suffix));
        return res;

        
    }
}