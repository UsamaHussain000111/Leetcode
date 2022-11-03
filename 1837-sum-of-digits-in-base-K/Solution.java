class Solution {
    public int sumBase(int n, int k) {
        
        int res = 0;
        while(n > 0){
            res += n % k;
            n /= k;
        }
        return res;
    }
}

// why this solution works?

// The general steps for converting a base 10 or "normal" number into another base are:

// 1) First, divide the number by the base to get the remainder. This remainder is the first, i.e. least significant, digit of the new number in the other base
// 2) Then repeat the process by dividing the quotient of step 1, by the new base. This time, the remainder is the second digit, i.e. the second least significant.
// 3) Repeat this process until your quotient becomes less than the base. This quotient is the last digit, i.e. the most significant digit.

// So here, instead of creating the number, we are adding up the remainders so as to get the result directly.

//more references:

// https://leetcode.com/problems/sum-of-digits-in-base-k/discuss/1175202/C%2B%2BJava-Iterative
// https://leetcode.com/problems/sum-of-digits-in-base-k/discuss/1175093/JavaPython-3-Mod-and-divide-w-analysis.
// https://codeforces.com/blog/entry/59075