class Solution {
    public static int reverse(int x) {
        String in = Integer.toString(x);
        boolean isNeg = false;
        String res="";
        for(int i = in.length()-1; i>=0; i--){
            
            if(in.charAt(i)!='-'){
            res+=in.charAt(i);
                
            }
            else{
                isNeg = true;
            }
            
        }
        

        try{
        if(isNeg){
             return Integer.parseInt("-"+res); 
        }
        else{
            return Integer.parseInt(res); 
        }
        } catch(NumberFormatException e){return 0;}
        
    }
    
}