// basically , its a fibonacci series
// why its a fibonacci series? to find out refer to the following videos:
// https://www.youtube.com/watch?v=Y0lT9Fck7qI (neetcode)
// https://www.youtube.com/watch?v=uHAToNgAPaM (kevin) (using dp)
//  https://www.youtube.com/watch?v=5o-kdjv7FD0 (cs dojo) (using dp)

class Solution {
    public int climbStairs(int n) {

        int one = 1;
        int two = 1;

        for(int i = 0; i < n - 1 ; i++)
        {
            int temp = one;
            one = one + two;
            two = temp;
        }
        
        return one;
    }
}