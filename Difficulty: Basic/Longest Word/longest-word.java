class Solution {
    public String longest(String[] arr) {
        // code here
        String max = arr[0];
        
        for(String s : arr) {
            if(s.length() > max.length()) {
                max = s;
            }
        }
        return max;
    }
}

