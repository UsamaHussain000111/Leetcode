// recursive solution
class Solution {
    public boolean isPowerOfFour(int n) {
        
        if(n == 0)
            return false;
        
        if(n == 1)
            return true;
        
        if(n % 4 != 0) return false;
             
        return isPowerOfFour(n / 4);
        
    }
}

// without bit manipulations

class Solution {
    public boolean isPowerOfFour(int n) {
        return n>0 && (n & (n-1)) == 0 && (n-1)%3==0;
    }
}

// Explanation:

// - n>0 is there to check if the number is positive, since negative numbers are not power of 4.
// - (n & (n-1)) == 0 is there to check if the binary representation of the number has only one 1 in it.
// - (n-1)%3==0 is to check 4 to the power x minus 1 is divisible by 3. This is mathematically true for all powers of 4.