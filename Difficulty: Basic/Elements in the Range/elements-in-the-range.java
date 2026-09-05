class Solution {
    public boolean checkElements(int start, int end, int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i : arr){
            list.add(i);
        }
        
        for(int i = start; i <= end; i++) {
            if(!list.contains(i)){
                return false;
            }
        }
        return true;
    }
}