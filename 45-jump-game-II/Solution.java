class Solution {
    public int jump(int[] nums) {
        
       int jump = 0;
        int currEnd = 0;
        int currFur = 0;
        for(int i = 0 ; i < nums.length - 1; i++)
        {
            currFur = Math.max(currFur , i + nums[i]);
            if(i == currEnd){
                jump++;
                currEnd = currFur;
            }
        }
        
        return jump;
    }
}