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