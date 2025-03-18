class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstrowhaszero = false;
        boolean firstcolhaszero = false;
        
    //checks if the first column has any zero
        for(int i = 0; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                firstcolhaszero = true;
                break;
            }
        }
    //checks if the first row has any zero
        for(int i = 0; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                firstrowhaszero = true;
                break;
            }
        }
    //checks from 1,1 index if any has zero and store it in first row and cols
        for(int i = 1;i <matrix.length; i++){
            for(int j = 1; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        //iterate thorugh first col and change to zero accordingly
        for(int i = 1; i<matrix.length; i++){
            if(matrix[i][0] == 0){
                for(int j = 0; j< matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        //iterate through first row and change to zero accordingly

        for(int i = 1; i<matrix[0].length; i++){
            if(matrix[0][i] == 0){
                for(int j = 0; j<matrix.length; j++){
                    matrix[j][i]=0;
                }
            }
        }

        
        if(firstrowhaszero){
            for(int i = 0; i<matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }
        if(firstcolhaszero){
            for(int i = 0; i<matrix.length; i++){
                matrix[i][0] = 0;
            }
        }
        return;
        
    }
}