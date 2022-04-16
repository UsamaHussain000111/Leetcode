class Solution {
    public int balancedStringSplit(String s) {
        
        int l = 0;
        int r = 0;
        int res = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == 'L'){
                l++;
            }else{
                r++;
            }
            
            if(l == r){
                res++;
                l = 0;
                r = 0;
            }
        }
        return res;
    }
}