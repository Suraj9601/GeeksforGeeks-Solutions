class Solution {
    String remConsonants(String s) {
        
        StringBuilder sb = new StringBuilder();
        
        for(char ch : s.toCharArray()) {
            if("aeiou".indexOf(ch) != -1 || "AEIOU".indexOf(ch) != -1) {
                sb.append(ch);
            }
        }
        
        return new String(sb);
    }
};