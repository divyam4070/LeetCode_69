class Solution {
    public int maxScore(int[] cardPoints, int k) {

        int res = 0;
        int sum = 0;
        int i = 0;
        while(i<2*k){
            if(i>k-1){
                sum-= cardPoints[((cardPoints.length-k+i)%cardPoints.length)+(cardPoints.length-k)];
            }
            sum += cardPoints[((cardPoints.length-k+i)%cardPoints.length)];
            if(sum>res){
                res = sum;
            }
            i++;
        }

        return res;
        
    }
}