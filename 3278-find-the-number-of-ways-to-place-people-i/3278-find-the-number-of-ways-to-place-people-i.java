class Solution {
    public int numberOfPairs(int[][] points) {

        int prev = Integer.MIN_VALUE;
        int res = 0;

        Arrays.sort(points, (a,b) ->{
            if(a[0] != b[0]){
                return Integer.compare(a[0], b[0]);
            }
            else{
                return Integer.compare(b[1], a[1]);
            }
        });

        for(int i =0 ;i<points.length; i++){
            prev = Integer.MIN_VALUE;
            for(int j=i+1; j<points.length; j++){
                if(points[j][1]<=points[i][1] && prev<points[j][1]){
                    res++;
                    prev = points[j][1];
                }
            }
        }

        return res;
        
    }
}