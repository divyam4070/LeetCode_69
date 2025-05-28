class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] arr = new int[m][n];
        for(int i=m-1 ;i>=0; i--){
            for(int j=n-1; j>=0;j--){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                    continue;
                }
                if(i==m-1 && j==n-1){
                    arr[i][j]=1;
                }
                else if(i==m-1){
                    arr[i][j]=arr[i][j+1];
                }
                else if(j==n-1){
                    arr[i][j]=arr[i+1][j];
                }
                else{
                    arr[i][j]=arr[i][j+1]+arr[i+1][j];
                }

            }
        }

        return arr[0][0];
        
        
    }
}
