class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int k = target-nums[i];
            if(!h.containsKey(k)){
                h.put(nums[i],i );
            }
            else{
                return new int[]{h.get(k),i};
            }
        }
        return new int[]{-1,-1};
    }
}