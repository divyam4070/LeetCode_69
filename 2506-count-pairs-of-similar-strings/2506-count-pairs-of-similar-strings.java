class Solution {
    public int similarPairs(String[] words) {
        int count = 0;
        HashMap<String,Integer> m = new HashMap<>();

        for(int i=0; i<words.length; i++){
            HashSet<Character> st = new HashSet<>();
            for(int j=0; j<words[i].length(); j++){
                st.add(words[i].charAt(j));
            }
            String stt ="";
            for(Character ss:st){
                stt+=ss;
            }
            m.put(stt, m.getOrDefault(stt, 0) + 1);



        }
        for(Map.Entry<String, Integer> entry : m.entrySet()){
            int frequency = entry.getValue();
            count += (frequency * (frequency - 1)) / 2;
        }

        return count;
        
    }
}