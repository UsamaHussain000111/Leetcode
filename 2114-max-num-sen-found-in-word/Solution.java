class Solution {
    public int mostWordsFound(String[] sentences) {
        int current_max = 0;
        int max_words = current_max;
        for(int i = 0; i < sentences.length ; i++)
        {
            String[] words = sentences[i].split(" ");
            current_max = words.length;
            max_words = Math.max(current_max , max_words);
        }
        
        return max_words;
    }
}