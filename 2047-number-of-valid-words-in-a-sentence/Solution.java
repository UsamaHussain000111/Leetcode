class Solution {
    public int countValidWords(String sentence) {

        int n = sentence.length();
        if(n == 0) return 0;

        String words[] = sentence.strip().split("\\s+");
        int res = 0;
        
        for(String word : words){

            if(isValid(word)) //check if each word/ token is valid
                res++;
        }

        return res;
    }

    public boolean isValid(String s){

        int hyphen = 0; // to check for hyphens

        for(int i = 0 ; i < s.length() ; i++){

            char c = s.charAt(i);

            if(Character.isDigit(c)) return false; // if c is digit, return false
            if(Character.isLowerCase(c)) continue; // check for lowercase

            if(c == '-'){

                if(++hyphen > 1) return false; // more than one hyphen is not allowed

                if(i - 1 < 0 || !Character.isLowerCase(s.charAt(i-1)) || i + 1 >= s.length() 
                || !Character.isLowerCase(s.charAt(i+1))) //hyphen should be sorrounded by lower case alphabets
                    return false;
            }else if(i != s.length() - 1) return false; //punctuation mark is allowed only at the end of token
        }
        return true; //all the conditions satisfied
    }
}