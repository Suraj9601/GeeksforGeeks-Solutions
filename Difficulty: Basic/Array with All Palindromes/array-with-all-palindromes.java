class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i : arr) {
            if(!isPalindrome(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isPalindrome(int num) {
        int n = num;
        int newNo = 0;
        
        if(num < 0) return false;
        
        while(num > 0) {
            int temp = num % 10;
            num = num / 10;
            newNo = newNo * 10 + temp;
        }
        
        return n == newNo;
    }
}