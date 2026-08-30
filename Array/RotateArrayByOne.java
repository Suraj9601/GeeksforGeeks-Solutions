class RotateArrayByOne {
    public void rotate(int[] arr) {
        // code here
        int k = 1;
        reverse(arr, 0, arr.length-1);
        reverse(arr, k, arr.length -1);
        
    }
    
    public void reverse(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}