public class Solution {
    public int reverse(int x) {
        // Define the 32-bit signed integer range
        int INT_MIN = -2147483648;
        int INT_MAX = 2147483647;
        
       int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        
        long reversed = 0;
        
        while (x != 0) {

            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        reversed *= sign;
        

        if (reversed < INT_MIN || reversed > INT_MAX) {
            return 0;
        }
         return (int) reversed;
    }
}