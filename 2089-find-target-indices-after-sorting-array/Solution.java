class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length - 1;
        
        for(int num : nums){
            
            if(num < target)
                low++;
            else if(num > target)
                high--;
            
        }
        
        List<Integer> res = new ArrayList<Integer>();
        
        while(low <= high){
            res.add(low++);
        }
        
        return res;
    }
}