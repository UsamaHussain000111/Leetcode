class Solution {
    public int repeatedNTimes(int[] nums) {
    
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(set.add(nums[i]) == false){
                return nums[i];
            }else{
                set.add(nums[i]);
            }
            
        }
        
        return 0;
    }
}