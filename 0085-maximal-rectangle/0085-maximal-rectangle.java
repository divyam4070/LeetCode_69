class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0){
            return 0;
        }
        if(matrix.length == 1){
            int res = 0;
            int ans = 0;
            for(int i =0;i<matrix[0].length; i++){
                if(matrix[0][i]=='1'){
                    res+=1;
                }
                else{
                    res = 0;
                }
                ans = Math.max(ans,res);
            }
            return ans;
        }

        int rows = matrix.length;
        int res = 0;
        int cols = matrix[0].length;
        int[] hehe = new int[cols];
        for(int i = 0; i<rows; i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1'){
                    hehe[j]+=1;
                }
                else{
                    hehe[j] = 0;
                }
            }
            int bachao = helper(hehe);
            res = Math.max(res, bachao);
        }
        return res;
    }
    static int helper(int[] heights){
        int len = heights.length;
        Stack<Integer> s = new Stack<>();
        int maxArea = 0;
        for(int i = 0 ; i<=len; i++){
            int h = (i==len? 0: heights[i]);
            if(s.isEmpty()|| h>=heights[s.peek()]){
                s.push(i);
            } else{
                int tp = s.pop();
                maxArea = Math.max(maxArea, heights[tp]*(s.isEmpty()? i: i-1-s.peek()));
                i--;
            }
        }
        return maxArea;
    }
}