class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        
        for(int i : arr) {
            
            map.put(i, map.getOrDefault(i, 0) + 1);
            
            if(map.get(i) > arr.length/3 && !list.contains(i)) {
                list.add(i);
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}