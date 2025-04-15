class Solution {
    public boolean isSubsequence(String s, String t) {
        int j = 0;
        if(s.length()==0){
            return true;
        }
        if(t.length()<s.length()){
            return false;
        }
        for(int i = 0; i<t.length(); i++){
            if(t.charAt(i)==s.charAt(j)){
                j++;
            }

            if(j==s.length()){
                return true;
            }
        }

        // System.out.println("hehe");
        return false;
    }
}