// another impressive solution I found in discussion using recursion
// Runtime: 0 ms, faster than 100.00% , Memory Usage: 44.9 MB, less than 45.32%

class Solution {
    public int findFinalValue(int[] nums, int target) {
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return findFinalValue(nums,target*2);
            }
        }

        for(i=0;i<nums.length;i++)
        {
            if(nums[i]!=target) return target;
        }

       return target;
    }
}