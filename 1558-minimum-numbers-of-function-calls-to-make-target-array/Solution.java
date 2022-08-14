class Solution {
    public int minOperations(int[] nums) {
        
        int res = 0;
        int currDivides = 0;
        int maxDivides = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            currDivides = 0;
            int n = nums[i];
            
            while(n > 0){
                
                if(n % 2 == 0){
                    n /= 2;
                    currDivides++;
                    if(currDivides > maxDivides){
                        res++;
                        maxDivides = currDivides;
                    }
                }else{
                    n--;
                    res++;
                }
                
            }
            
        }
        return res;
    }
}