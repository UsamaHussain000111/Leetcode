// Solution 1

class Solution {
    public String replaceDigits(String s) {
        
        char[] str = s.toCharArray();
        
        for(int i = 1 ; i < str.length ; i += 2){
            str[i] = shift(str[i - 1] , str[i]);
        }
        
        return String.valueOf(str);
    }
    
    private char shift(char c , char x){
        
        int a = Character.getNumericValue(x);
        int asci = (int)c;
        char res = (char)(asci + a);
        return res;
    }
    
}

// Solution 2

class Solution {
    public String replaceDigits(String s) {
        
        char[] charArr = s.toCharArray();
        
        for (int i = 1; i < charArr.length; i += 2) {
            charArr[i] = (char)(charArr[i - 1] + charArr[i] - '0');
        }

        return String.valueOf(charArr);
    }
}