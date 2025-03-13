class Solution {
    public int maxScore(String s) {
        int[] prefix = new int[s.length()];
        int[] suffix = new int[s.length()];
        int sum = 0 ;
        int sum2 = 0;
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                sum++;
            }
            prefix[i] = sum;
            System.out.println(sum);
        }
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(s.length()-i-1)=='1'){
                sum2++;
            }
            suffix[suffix.length-i-1] = sum2;
            System.out.println(sum2);

        }
        int res = 0;
        for(int i = 0; i<prefix.length-1; i++){
            sum = prefix[i]+suffix[i+1];
            res = Math.max(res, sum);
        }
        return res;
        
        
    }
}