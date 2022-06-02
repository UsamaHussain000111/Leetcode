class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        
        for(char c: magazine.toCharArray()){
            int count = map.containsKey(c) ? map.get(c) + 1 : 1;
            map.put(c , count);
        }
        
        for(char c: ransomNote.toCharArray()){
            int newcount = map.containsKey(c) ? map.get(c) - 1 : -1;
            if(newcount < 0) return false;
            map.put(c , newcount);
        }
        
        return true;
    }
}