class Solution {
    public String sortSentence(String s) {
        
        String[] words = s.split(" ");
        String[] res = new String[words.length];
        
        int i = 0;
        
        for(String word : words){

            i = word.length() - 1;
            res[word.charAt(i) - '1'] = word.substring(0 , i);
        }
        
        return String.join(" ", res);
    }
}