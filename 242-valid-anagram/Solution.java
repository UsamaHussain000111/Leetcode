class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length())
            return false;
        
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        
        for(char c : s.toCharArray()){
            
            map.put(c , map.getOrDefault( c , 0) + 1 ); 
        }
        
        for(char c : t.toCharArray()){
            
            int curr = map.getOrDefault( c , 0 );
            
            if(curr == 0)
                return false;
            else
                map.put(c , curr - 1);
        }
        
        return true;
        
    }
}