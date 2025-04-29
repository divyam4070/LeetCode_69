class Solution {
    public int trap(int[] height) {
        int water = 0;
        int leftMax= 0;
        int rightMax = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            if(height[left]<height[right]){
                if(leftMax<=height[left]){
                leftMax = Math.max(leftMax,height[left]);

                }
                

                water+= leftMax-height[left];
                
                left++;
            }
            else{
                if(rightMax<=height[right]){
                rightMax = Math.max(height[right],rightMax);

                }
               
                water+= rightMax-height[right];

                
                right--;
            }
        }
        return water;
        
    }
}