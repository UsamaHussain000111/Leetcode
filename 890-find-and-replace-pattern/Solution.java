class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> res = new ArrayList<String>();
        
        for(String word : words){
            
            if(match(word, pattern))
                res.add(word);
        }
        
        return res;
    }
    
    public boolean match(String word , String pattern){
        
        HashMap<Character , Character> map1 = new HashMap<Character , Character>();
        HashMap<Character , Character> map2 = new HashMap<Character , Character>();    
        
        for(int i = 0 ; i < word.length() ; i++){
            
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            
            if(!map1.containsKey(w))
                map1.put(w , p);
            
            if(!map2.containsKey(p))
                map2.put(p , w);
            
            if(map1.get(w) != p || map2.get(p) != w)
                return false;
            
        }
        
        return true;
    }
    
}