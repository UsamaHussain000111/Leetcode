class Solution {
    public String capitalizeTitle(String title) {
        
        title = title.toLowerCase();
        String[] words = title.split(" ");
        
        for(int i = 0; i < words.length; i++)
        {
            if(words[i].length() > 2)
            {
                String word = Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1);
                words[i] = word;
            }
        }
        
        return String.join(" ", words);
        
    }
}