class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long sum = 0;
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i =  0;i <nums.length; i++){
            if(i>k-1){
                sum-=nums[i-k];
                h.put(nums[i-k], h.get(nums[i-k])-1);
                if(h.get(nums[i-k])==0){
                    h.remove(nums[i-k]);
                }
            }
            h.put(nums[i], h.getOrDefault(nums[i], 0)+1);
            sum+=nums[i];
            if(h.size()==k){
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}