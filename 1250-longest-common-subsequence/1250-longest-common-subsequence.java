class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int n = text1.length();
        int m = text2.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

        return LCS(text1, text2, n-1, m-1, dp);
    }

    public static int LCS(String s1, String s2, int n, int m, int dp[][]){

        if(n < 0 || m < 0){
            return 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(s1.charAt(n) == s2.charAt(m)){
            return dp[n][m] = 1 + LCS(s1, s2, n-1, m-1, dp);
        }
        else{
            return dp[n][m] =  Math.max(LCS(s1, s2, n-1, m, dp), LCS(s1, s2, n, m-1, dp));
        }
    }
}