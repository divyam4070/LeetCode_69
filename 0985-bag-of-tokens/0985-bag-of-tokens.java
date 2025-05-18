class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int left = 0;
        int right = tokens.length-1;
        int score = 0;
        Arrays.sort(tokens);
        while(left<right){
            if(tokens[left]<=power){

                score++;
                power-=tokens[left];
                left++;
                System.out.print(power);
            }
            else if(score>=1){
                score--;
                power+=tokens[right];
                System.out.print(power);
                right--;
            }
            else{
                left++;
            }
        }
        if(left==right){
            if(power>=tokens[left]){
                score++;
            }

        }

        return score;
    }
}