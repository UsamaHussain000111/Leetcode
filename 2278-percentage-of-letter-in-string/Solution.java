class Solution {
    public int percentageLetter(String s, char letter) {
        
        double occurrence = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            if(letter == s.charAt(i)){
                occurrence++;
            }
        }
        
        return (int)( ( occurrence / s.length() ) * 100);
    }
}