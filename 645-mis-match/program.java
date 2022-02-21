class Solution {
    public int[] findErrorNums(int[] nums) {
        
        HashSet<Integer> new_set = new HashSet<Integer>();
        int repeated = 0;
        int n = nums.length;
        int total_sum = n * (n + 1) / 2;
        for(int i = 0; i < nums.length ; i++)
        {
            if(new_set.contains(nums[i]))
            {
                repeated = nums[i];
            }
            
            new_set.add(nums[i]);
        }
        
        int ans = 0;
        
        for(int i : new_set)
        {
            ans += i;
        }
        
        int final_ans = total_sum - ans;
        
        return new int[] {repeated , final_ans};
    }
}