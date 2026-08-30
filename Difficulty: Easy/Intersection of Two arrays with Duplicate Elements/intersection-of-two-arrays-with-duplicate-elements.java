class Solution {
    public ArrayList<Integer> intersect(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
        for(int i : a) {
            set.add(i);
        }
        
        for(int x : b){
            if(set.contains(x)) {
                result.add(x);
            }
        }
        
        return new ArrayList<>(result);
    }
}