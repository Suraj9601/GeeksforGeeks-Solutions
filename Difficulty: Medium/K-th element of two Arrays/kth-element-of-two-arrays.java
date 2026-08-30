class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();

        
        for(int i : a) {
            list.add(i);
        }
        for(int x : b) {
            list.add(x);
        }
        
        Collections.sort(list);
        
        return list.get(k-1);
    }
}