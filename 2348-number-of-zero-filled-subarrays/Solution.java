class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long res = 0;
        int subArray = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] == 0)
                subArray++;
            else
                subArray = 0;
            
            res += subArray;
        }
        return res;
    }
}