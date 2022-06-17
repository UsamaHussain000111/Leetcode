class Solution {
    public int findClosestNumber(int[] nums) {
        
        int close = nums[0];
        
        for(int i : nums){
            
            if(Math.abs(i) < Math.abs(close) || i == Math.abs(close))
                close = i;
            
        }
        
        return close;
        
    }
}