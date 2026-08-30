import java.util.*;

class MinAndMaxInArray {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here

        ArrayList<Integer> newArr = new ArrayList<>();
        for (int i : arr) {
            newArr.add(i);
        }
        int min = Collections.min(newArr);
        int max = Collections.max(newArr);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        return list;
    }
}