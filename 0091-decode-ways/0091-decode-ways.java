class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(s.charAt(0) == '0') return 0;
        if(n==1) return 1;
        int[] dp = new int[n+2];
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='0') dp[i] = 0;
            else{
                dp[i]=dp[i+1];
                if((i+1)<n){
                    int twoDigit = Integer.parseInt(s.substring(i, i + 2));
                    if (twoDigit >= 10 && twoDigit <= 26) dp[i] += dp[i+2];
                }
            }
        }  
        return dp[0];
 }
}