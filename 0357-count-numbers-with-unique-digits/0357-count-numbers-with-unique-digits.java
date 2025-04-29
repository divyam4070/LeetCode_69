class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }
        int uDigits = 10;
        int start = 9;
        int current = 9;

        for(int i =2; i<=n && current>0; i++){
            start = start*current;
            uDigits+=start;
            current--;
        }
        return uDigits;
    }
}