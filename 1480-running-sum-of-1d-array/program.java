class Solution {
    public int[] runningSum(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            if(count != 0)
            {
                nums[i] = nums[i] + nums[i - 1];
            } 
            
            count++;
        }
        
        return nums;
    }
}