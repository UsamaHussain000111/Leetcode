class Solution {
    public int[] productExceptSelf(int[] nums) {

        int prefix = 1;
        int postfix = 1;

        int[] output = new int[nums.length];

        for(int i = 0 ; i < nums.length ; i++){

            output[i] = prefix;
            prefix = nums[i] * prefix;
        }

        for(int i = nums.length - 1; i >= 0 ; i--){
            
            output[i] = output[i] * postfix;
            postfix = nums[i] * postfix;
        }

        return output;
    }
}

// for understanding the algorithm, please refer to the following video
// https://www.youtube.com/watch?v=bNvIQI2wAjk&t=601s&ab_channel=NeetCode