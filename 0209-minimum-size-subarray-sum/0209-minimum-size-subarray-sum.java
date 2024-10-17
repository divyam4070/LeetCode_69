class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE; // Start with max value for comparison

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r]; // Add the current element to the sum
            
            while (sum >= target) { // While the sum is greater than or equal to target
                res = Math.min(res, r - l + 1); // Update the result with the length of the current subarray
                sum -= nums[l]; // Subtract the leftmost element from the sum
                l++; // Move the left pointer to the right
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res; // If res is unchanged, return 0
    }
}
