class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        int evenSum = 0;
        
        for(int i : nums){
            if(i % 2 == 0)
                evenSum += i;
        }
        
        int res[] = new int[nums.length];
        
        for(int i = 0 ; i < nums.length ; i++){
            
            int val = queries[i][0] , index = queries[i][1]; 
            if(nums[index] % 2 == 0) evenSum -= nums[index];
            nums[index] += val;
            if(nums[index] % 2 == 0) evenSum += nums[index];
            res[i] = evenSum;
        }
        return res;
    }
}