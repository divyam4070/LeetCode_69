class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        boolean oddPresent = false;
        for(char c:s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry: map.entrySet()){
            if(entry.getValue()%2==0){
                res+=entry.getValue();
            }
            else{
                oddPresent = true;
                res+=entry.getValue()-1;
            }
        }
        if(oddPresent){
            res+=1;
        }
        return res;
    }
}