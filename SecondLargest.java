class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1;
        int secMax = -1;
        
        for(int i : arr) {
            if(i > max) {
                secMax = max;
                max = i;
            }
            
            if(i < max && i > secMax){
                secMax = i;
            }
        }      
        return secMax;
    }
}