class Solution {
    public int pivotInteger(int n) {
        int summ = n*(n+1)/2;
        int sum = 0;
        for(int i = 1; i<n+1; i++){
            sum+=i;
            if(sum == summ-sum+i){
                return i;
            }
            
        }



        return -1;

        
    }
}