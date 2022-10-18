class Solution {
    public int findMaxK(int[] nums) {
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i : nums){
            set.add(i);
        }
        
        int max = -1;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] > max && set.contains(-nums[i])){
                
                max = nums[i];
            }
        }
        
        return max;
        
    }
}