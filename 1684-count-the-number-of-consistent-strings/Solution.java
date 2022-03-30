class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        HashSet<Character> hashset = new HashSet<Character>();
        for(int i = 0; i < allowed.length() ; i++){
            hashset.add(allowed.charAt(i));
        }
        
        for(String word : words){
            for(int i = 0 ; i < word.length() ; i++){
                if(!hashset.contains(word.charAt(i))){
                    break;
                }
                
                if(i == word.length() -1)
                {
                    count++;
                }
            }
        }
        
        
        
        return count;
    }
}