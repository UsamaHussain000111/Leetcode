// no need to calculate the product of array and then find its sign, just check each value sign.

class Solution {
    
    public int arraySign(int[] nums) {
        
        int sign = 1; 
        
        for (int i = 0 ; i < nums.length ; i++) {
            
            if (nums[i] < 0) {
                sign = -sign; 
            } if (nums[i] == 0) {
                return 0; 
            }
        }
        
        return sign;
        
    }
}