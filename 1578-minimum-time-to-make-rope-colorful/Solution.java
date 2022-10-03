class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        int res = 0;
        int prev = neededTime[0];

        for(int i = 1 ; i < colors.length() ; i++){
            
            if(colors.charAt(i) == colors.charAt(i - 1)){
                
                res += Math.min(neededTime[i] , prev);
                prev = Math.max(neededTime[i], prev);
    
            }else
                prev = neededTime[i];
        }
        
        return res;
    }
}