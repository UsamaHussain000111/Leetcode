class Solution {
    
    private boolean monotonicIncreasing(int[] nums){
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }
    
    private boolean monotonicDecreasing(int[] nums){
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i + 1] < nums[i]){
                return false;
            }
        }
        return true;
    }
    
    public boolean isMonotonic(int[] nums) {
        return monotonicIncreasing(nums) || monotonicDecreasing(nums);
    }
}