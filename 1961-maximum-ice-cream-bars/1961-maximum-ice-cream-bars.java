class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int sum = 0;
        int ans = 0;
        Arrays.sort(costs);
        for(int i = 0 ; i<costs.length; i++){
            if(costs[i]>coins){
                continue;
            }
            coins-=costs[i];
            ans++;
        }
        return ans;
    }
}