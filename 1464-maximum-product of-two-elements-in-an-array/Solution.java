class Solution {
    public int maxProduct(int[] nums) {
        
        int max = 0;
        int n = nums.length;
        
        for(int i = 0 ; i < n - 1 ; i++){
            
            int j = i + 1;
            
            while(j < n){
                
                int curr = (nums[i] - 1) * (nums[j] - 1);
                max = Math.max(max , curr);
                j++;
            }
        }
        
        return max;
    }
}