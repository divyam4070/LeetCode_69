class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int max = Integer.MIN_VALUE;
        int idx = 0;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arrays.size(); i++){
            if(arrays.get(i).get(arrays.get(i).size()-1)>max){
                max = arrays.get(i).get(arrays.get(i).size()-1);
                idx = i;
            }
        }
        System.out.println(max);
        for(int i=0; i<arrays.size(); i++){
            if(arrays.get(i).get(0)<min && i!=idx){
                min = arrays.get(i).get(0);
            }
        }
        System.out.println(min);
        System.out.print(idx);
        if(arrays.get(idx).get(0)>=min){
            return max-min;
        }
        else{
            min = arrays.get(idx).get(0);
            max = Integer.MIN_VALUE;
            System.out.println(max);
            for(int i=0; i<arrays.size(); i++){
                System.out.print("lol");
                if(arrays.get(i).get(arrays.get(i).size()-1)>max && i!=idx){
                    max = arrays.get(i).get(arrays.get(i).size()-1);
                }
            
            }
            System.out.println(max);
            System.out.println(min);
            return max-min;
        }
            
        
      

    }
}