class Solution {
    public int maximumCount(int[] nums) {
        int count = 0;
        int count2 = 0;
        for(int i :nums){
            if(i>0){
                count++;
            }
            else if(i<0){
                count2++;
            }
        }
        return Math.max(count,count2);
        
    }
}