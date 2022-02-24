// my orignal solution
// Runtime: 5 ms, faster than 46.95%, Memory Usage: 45.2 MB, less than 39.26%

import java.util.Arrays;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        int check = original;
        
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length ; i++)
        {
            if(nums[i] == original)
            {
                original = original * 2;
            }
        }
        
        if(check == original)
        {
            return check;
        }
        else
        {
            return original;
        }
        
        
    }
}