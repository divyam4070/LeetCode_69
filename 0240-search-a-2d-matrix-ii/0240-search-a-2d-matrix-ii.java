class Solution {
    public boolean searchMatrix(int[][] a, int target) {
        int n = a.length, m = a[0].length;
        int row = 0, col = m - 1;

        while (row < n && col >= 0) {
            if (a[row][col] == target) {
                return true;
            }
            else if (a[row][col] > target) {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
}