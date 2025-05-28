class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
      
        
        for(int i=obstacleGrid.length-1 ;i>=0; i--){
            for(int j=obstacleGrid[0].length-1; j>=0;j--){
                if(obstacleGrid[i][j]==1){
                    obstacleGrid[i][j]=0;
                    continue;
                }
                else if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1){
                    obstacleGrid[i][j]=1;
                }
                else if(i==obstacleGrid.length-1){
                    obstacleGrid[i][j]=obstacleGrid[i][j+1];
                }
                else if(j==obstacleGrid[0].length-1){
                    obstacleGrid[i][j]=obstacleGrid[i+1][j];
                }
                else{
                    obstacleGrid[i][j]=obstacleGrid[i][j+1]+obstacleGrid[i+1][j];
                }

            }
        }

        return obstacleGrid[0][0];
        
        
    }
}
