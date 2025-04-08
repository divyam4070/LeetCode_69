class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        boolean oddPresent = false;
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Integer values: map.values()){
            if(values%2==0){
                res+=values;
            }
            else{
                oddPresent = true;
                res+=values-1;
            }
        }
        if(oddPresent){
            res+=1;
        }
        return res;
    }
}