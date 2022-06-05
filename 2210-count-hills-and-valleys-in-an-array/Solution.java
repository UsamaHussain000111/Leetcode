class Solution {
    
    
    public int countHillValley(int[] nums) {
        
        int count = 0;
        int l = nums[0];
        
        for(int i = 1 ; i < nums.length - 1 ; i++){
            if( isHill(l , nums[i]  , nums[i+1] ) || isValley(l , nums[i]  , nums[i+1] ) ){
                count++;
                l = nums[i];
            }
        }
        
        return count;
    }
    
    private boolean isHill(int previous , int i  , int next){
        return i > previous && i > next;
    }
    
    private boolean isValley(int previous , int i  , int next){
        return i < previous && i < next;
    }
    
}