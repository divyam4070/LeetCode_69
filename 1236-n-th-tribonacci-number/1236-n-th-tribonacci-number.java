class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3; i<n+1; i++){
            arr[i] = arr[i-3]+arr[i-2]+arr[i-1];
          
        }
       

        return arr[n];
    }
}