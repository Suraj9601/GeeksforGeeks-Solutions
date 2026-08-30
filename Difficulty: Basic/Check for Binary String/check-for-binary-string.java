class Solution {
    public boolean isBinary(String s) {
        // code here
        for(char ch : s.toCharArray()) {
            if(ch != '1' && ch != '0') {
                return false;
            }
        }
        return true;
    }
}