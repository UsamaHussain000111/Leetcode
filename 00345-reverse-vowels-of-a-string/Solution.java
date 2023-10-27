// using stringBuilder
// Runtime: 6 ms, faster than 66.71% , Memory Usage: 45.6 MB, less than 34.94%

class Solution {
    public String reverseVowels(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(isVowel(str.charAt(i)) == true && isVowel(str.charAt(j)) == true){
                char temp = str.charAt(i);
                str.setCharAt(i , str.charAt(j));
                str.setCharAt(j , temp);
                i++;
                j--;
            }else if(isVowel(str.charAt(i))){
                j--;
            }else{
                i++;
            }
            
        }
        return str.toString();
    }
    
    boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
			return true;
		else if(c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
			return true;
		return false;
    }
}

// using array
// Runtime: 5 ms, faster than 86.05% , Memory Usage: 45.3 MB, less than 38.42%

class Solution {
    public String reverseVowels(String s) {
        
        int l = 0;
        int r = s.length() - 1;
        
        char[] sChar = s.toCharArray();
        
        while(l < r){
            
            if(isVowel(sChar[l]) && isVowel(sChar[r])){
                swap(sChar , l , r);
                l++;
                r--;
            }else if(isVowel(sChar[r])){
                l++;
            }else{
                r--;
            }
        }
        
        return new String(sChar);
    }
    
    Boolean isVowel(char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
            return true;
        return false;
    }
    
    void swap(char[] chars , int x , int y){
        char temp = chars[x];
        chars[x] = chars[y];
        chars[y] = temp;
    } 
    
}