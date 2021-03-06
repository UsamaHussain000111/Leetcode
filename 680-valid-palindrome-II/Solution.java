class Solution {
    
    private boolean isPalindrome(String str , int left , int right){
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    
    public boolean validPalindrome(String s) {
        
        int l = 0;
        int r = s.length() - 1;
        
        while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                return isPalindrome(s , l + 1 , r) || isPalindrome(s , l , r - 1);
            }
            l++;
            r--;
        }
        
        return true;
        
    }
}