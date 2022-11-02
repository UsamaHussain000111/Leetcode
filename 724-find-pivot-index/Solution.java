class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;
        int res = -1;
        
        if(n == 0)
            return res;
        
        int sum = 0;
        int leftSum = 0;
        
        for(int num : nums) 
            sum += num;
        
        for(int i = 0 ; i < nums.length ; i++){

            if(leftSum == sum - leftSum - nums[i])
                return i;
            
                leftSum += nums[i];
        }
        
        return -1;
    }
}