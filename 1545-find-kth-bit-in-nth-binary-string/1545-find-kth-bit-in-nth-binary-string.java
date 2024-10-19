class Solution {
    public char findKthBit(int n, int k) {
        int length = (int) (Math.pow(2, n) - 1);
        return helper(length, k).charAt(0);
    }
        public String helper(int length, int k){
            if(length == 1){
                return "0";
            }
            int half = length/2;
            if(k<=half){
                return helper(half, k);

            }
            else if (k>half+1){
                String res = helper(half, 1+length - k);
                if(res.equals("1")){
                    return "0";
                }
                return "1";

            }
            else{
                return "1";
            }
        }
        
    
}