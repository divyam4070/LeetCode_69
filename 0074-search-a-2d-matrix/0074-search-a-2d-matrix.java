class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length-1;
        for(int i =1; i<matrix.length; i++){
            // System.out.println(matrix[i][0]);
            
            if(matrix[i][0]>target){
                row = i-1;
                break;
            }
        }
        System.out.println(row);

        int low = 0;
        int high = matrix[0].length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
        
            if(matrix[row][mid] == target){
                return true;
            }
            if(matrix[row][mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return false;
    }
}