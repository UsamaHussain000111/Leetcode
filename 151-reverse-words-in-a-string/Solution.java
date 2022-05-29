class Solution {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        int j = words.length - 1;
        for(int i = 0 ; i < words.length / 2 ; i++){
            String t = words[i];
            words[i] = words[j];
            words[j] = t;
            j--;
        }
        
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            if(word != ""){
                sb.append(word);
                sb.append(" ");
            }
        }
        
        return sb.toString().trim();
        
    }
}