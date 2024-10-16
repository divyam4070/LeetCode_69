
// class Solution {
//     public int searchInsert(int[] nums, int target) {
//         for(int i = 0; i<nums.length; i++){
//             if(nums[i]==target){
//                 return i;
//             }
//             else if(nums[i]>target){
//                 return i;
//             }
//         }
//          return nums.length;
//     }
   
// }
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid = (l+r)/2;
        while(l<=r){
            mid = (l+r)/2;
            if (nums[mid]==target){
                return mid;
            }
            else if(nums[mid] > target){
                r = mid-1;
            }
            else {
              l = mid + 1;
            } 
        }
        if(l==mid){
        return mid;}
        return mid+1;
    }
   
}