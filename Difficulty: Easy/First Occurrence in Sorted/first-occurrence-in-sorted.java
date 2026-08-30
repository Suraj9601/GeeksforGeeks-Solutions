class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int mid;
        int ans = -1;
        
        while(left <= right) {
            
            mid = left + (right - left) / 2;
            
            if(k == arr[mid]) {
                ans =  mid;
                right = mid -1;
            }
            
            if(k > arr[mid]) {
                left = mid + 1;
            }
            
            else {
                right = mid -1;
            }
        }
        return ans;
    }
}