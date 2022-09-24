class Solution {
    public int countGoodSubstrings(String s) {
        
        int res = 0;
        
        for(int i = 0 ; i < s.length() - 2; i++){
            
            int p1 = i + 1;
            int p2 = i + 2;
            
            if(s.charAt(i) != s.charAt(p1) && s.charAt(i) != s.charAt(p2) && s.charAt(p1) != s.charAt(p2)){
                res++;
            }
        }
         return res;
    }
}