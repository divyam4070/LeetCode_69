class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        HashSet<Integer> h = new HashSet<>();
        
        int ans = 0;
        int sum = 0;
        for(int i=0; i<banned.length; i++){
            h.add(banned[i]);
        }
        int k = 1;
        for(int i=1; i<n+1; i++){
            if(sum+i>maxSum){
                return ans;
            }
            
            if(!h.contains(i)){
                sum+=i;
                ans++;
             

            }

            
        }

        return ans;
    }
}