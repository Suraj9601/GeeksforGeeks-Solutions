class Solution {
    public int lastIndex(String s) {
        // code here
        char[] chars = s.toCharArray();
        int idx = -1;
        for(int i=0; i < chars.length; i++) {
            if(chars[i] == '1') {
                idx = i;
            }
        }
        return idx;
    }
}