class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0;
        long sum2 = 0;
        long n_of_zero1=0;
        long n_of_zero2=0;
        for(int i=0; i<nums2.length; i++){
            if(nums2[i]==0){
                n_of_zero2++;
            }
            sum2+=nums2[i];
        }
        sum2+=n_of_zero2;
        for(int i=0;i<nums1.length; i++){
              if(nums1[i]==0){
                n_of_zero1++;
            }
            sum1+=nums1[i];
        }
        sum1+=n_of_zero1;
        long k = 0;
        if(sum1<sum2){
            k = n_of_zero1;
        }
        else{
            k = n_of_zero2;
        }
        if(sum1!=sum2 && k==0){
            return -1;
        }
        else{
            return Math.max(sum1, sum2);
        }
    }
}