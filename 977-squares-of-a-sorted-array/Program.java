// a simple trivial approach, squaring the array and sorting it

import java.util.Arrays;

class Program {
    public int[] sortedSquares(int[] nums) {
        
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i]; 
        }
        
        Arrays.sort(nums);
        
        return nums;
    }
}