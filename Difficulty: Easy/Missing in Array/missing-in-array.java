class Solution {
    int missingNum(int arr[]) {
        long n = arr.length+1;
        
        long expSum = (n * (n+1)) / 2;
        long actualSum = Arrays.stream(arr).sum();
        
        return (int)(expSum - actualSum);
    }
}