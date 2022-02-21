class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        int current_sum = 0;
        int actual_sum = n * (n + 1) / 2;
        for(int i = 0; i < n ; i++)
        {
            current_sum += nums[i];
        }
        
        return actual_sum - current_sum;
    
    }
}