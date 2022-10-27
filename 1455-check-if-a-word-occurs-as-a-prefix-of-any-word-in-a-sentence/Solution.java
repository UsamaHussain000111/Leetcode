class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        
        int res = -1;
        
        if(sentence.length() == 0)
            return res;
        
        String[] words = sentence.split(" ");
        
        for(int i = 0 ; i < words.length ; i++){
            
            if(words[i].startsWith(searchWord))
                return res + i + 2;
            
        }
        
        return res;
    }
}