class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        for(int i = dungeon.length-1; i>=0; i--){
            for(int j = dungeon[0].length-1; j>=0; j--){
                // if(i==dungeon.length-1 && j==dungeon[0].length-1){  
                //     if(dungeon[i][j]>0){
                //         dungeon[i][j]=0;
                //     }

                // }
                // else if(i==dungeon.length-1){
                //     if(dungeon[i][j]+dungeon[i][j+1]>0){
                //         dungeon[i][j]=0;
                //     }
                //     else{
                //         dungeon[i][j] = dungeon[i][j]+dungeon[i][j+1];
                //     }
                // }
                // else if(j == dungeon[0].length-1){
                //     if(dungeon[i][j]+dungeon[i+1][j]>0){
                //         dungeon[i][j]=0;
                //     }
                //     else{
                //         dungeon[i][j] =dungeon[i][j]+dungeon[i+1][j];
                //     }
                // }
                // else{
                //     if(Math.max(dungeon[i][j]+dungeon[i+1][j], dungeon[i][j]+dungeon[i][j+1])>0){
                //         dungeon[i][j]=0;
                //     }
                //     else{
                //         dungeon[i][j] = Math.max(dungeon[i][j]+dungeon[i+1][j], dungeon[i][j]+dungeon[i][j+1]);
                //     }
                // }
                dungeon[i][j] = helper(dungeon,i,j);
            }
        }


        return Math.abs(dungeon[0][0])+1;
    }
    int helper(int[][] dungeon, int i, int j){
        if(i==dungeon.length-1 && j == dungeon[0].length-1)
            return dungeon[i][j]>0 ? 0 : dungeon[i][j];
        
        if(i==dungeon.length-1)
            return dungeon[i][j]+dungeon[i][j+1]>0 ? 0: dungeon[i][j]+dungeon[i][j+1];

        if(j==dungeon[0].length-1)
            return dungeon[i][j]+dungeon[i+1][j]>0 ? 0: dungeon[i][j]+dungeon[i+1][j];
        
        return Math.max(dungeon[i][j]+dungeon[i+1][j], dungeon[i][j]+dungeon[i][j+1])>0 ? 0 : Math.max(dungeon[i][j]+dungeon[i+1][j], dungeon[i][j]+dungeon[i][j+1]);
        
    }
}