import java.util.HashMap;

class Solution {
    public String findValidPair(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        
        // Count occurrences of each character
        for (int i = 0; i < s.length(); i++) {
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        // For digits, compare count to numeric value
        for (int i = 0; i < s.length() - 1; i++) {
            char first = s.charAt(i);
            char second = s.charAt(i + 1);
            
            if (first != second && 
                h.get(first) == (first - '0') && 
                h.get(second) == (second - '0')) {
                return "" + first + second;
            }
        }
        
        return "";
    }
}
