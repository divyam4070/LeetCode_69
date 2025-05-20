class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
        int max = Integer.MIN_VALUE;
        int idx = 0;

        for(int i=0; i<arrays.size(); i++){
            if(arrays.get(i).get(arrays.get(i).size()-1)>max){
                max = arrays.get(i).get(arrays.get(i).size()-1);
                idx = i;
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arrays.size(); i++){
            if(arrays.get(i).get(0)<min && i!=idx){
                min = arrays.get(i).get(0);
            }
        }
        int ans1 = Math.abs(max-min);
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;

        for(int i=0; i<arrays.size(); i++){
            if(arrays.get(i).get(0)<min){
                min = arrays.get(i).get(0);
                idx = i;
            }
        }
        for(int i=0; i<arrays.size(); i++){
            if(arrays.get(i).get(arrays.get(i).size()-1)>max && i!=idx){
                max = arrays.get(i).get(arrays.get(i).size()-1);
                
            }
        }
        int ans2 = Math.abs(max-min);
        


        return Math.max(ans1, ans2);

    }
}