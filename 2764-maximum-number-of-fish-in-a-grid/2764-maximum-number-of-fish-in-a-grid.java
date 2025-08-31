class Solution {
    int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
    public int findMaxFish(int[][] grid) {
        int res =0; //maxFish
        for(int i= 0; i<grid.length; i++){
            for(int j=0; j<grid[0].length;  j++){
                if(grid[i][j] == 0){ //land cell
                    continue;
                }
                res = Math.max(res, helper(grid, i, j)); //water cell
            }
        }
        return res;
    }
    int helper(int[][] grid, int i, int j){
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0){
            return 0;
        }
        int fish = grid[i][j];
        grid[i][j] = 0;

        for(int k = 0; k<dir.length; k++){
            int i_ = i+dir[k][0];
            int j_ = j+dir[k][1];

            fish+=helper(grid, i_, j_);
            
        }

        return fish;
    }
}