// My orignal solution
//Runtime: 1 ms, faster than 98.85% , Memory Usage: 41.8 MB, less than 52.48%

class Solution {
    public int findNumbers(int[] nums) {
        int evenNumberOfDigits = 0;
        for(int i = 0; i < nums.length ; i++)
        {
            int count = 0;
            while(nums[i] != 0)
            {
                nums[i] /= 10;
                count++;
            }
            
            if(count % 2 == 0)
            {
                evenNumberOfDigits++;
            }
        }
        
        return evenNumberOfDigits;
    }
}