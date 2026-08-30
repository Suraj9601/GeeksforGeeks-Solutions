class Solution {
    public boolean checkDuplicates(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : arr) {
            
            if(set.contains(i)) {
                return true;
            }
            
            set.add(i);
        }
        
        return false;
    }
}