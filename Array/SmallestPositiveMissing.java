import java.util.*;

class SmallestPositiveMissing {
    public int missingNumber(int[] arr) {
        HashSet<Integer> set = new LinkedHashSet<>();
        
        for(int i : arr) {
            if(i > 0) {
                set.add(i);
            }
        }
        
        int smallest = 1;
        
        while(set.contains(smallest)){
            smallest++;
        }
        
        return smallest;
    }
}