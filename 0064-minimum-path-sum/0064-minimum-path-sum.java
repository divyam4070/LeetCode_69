class Solution {
    public int minPathSum(int[][] grid) {
        for(int i=grid.length-1; i>=0;i--){
            for(int j = grid[0].length-1; j>=0;j--){
                grid[i][j] = helper(grid, i, j);
                // if(i==grid.length-1 && j==grid[0].length-1){
                //     continue;
                // }
                // else if(i == grid.length-1){
                //     grid[i][j] =grid[i][j]+grid[i][j+1] ;
                // }
                // else if(j==grid[0].length-1){
                //     grid[i][j] = grid[i][j]+grid[i+1][j];
                // }
                // else{
                //     grid[i][j] = grid[i][j]+ Math.min(grid[i+1][j], grid[i][j+1]);
                // }
            }
        }
      

        return grid[0][0];
    }
    int helper(int[][] grid, int i, int j){
        if(i==grid.length-1 && j == grid[0].length-1){
            return grid[i][j];
        }
        if(i==grid.length-1){
            return grid[i][j]+grid[i][j+1];
        }
        if(j==grid[0].length-1){
            return grid[i][j]+grid[i+1][j];
        }
        return grid[i+1][j]>grid[i][j+1] ? grid[i][j]+grid[i][j+1]:grid[i][j]+grid[i+1][j];
    }
}