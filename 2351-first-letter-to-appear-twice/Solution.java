class Solution {
    public char repeatedCharacter(String s) {
        
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        
        for(char c : s.toCharArray()){
            
            map.put(c , map.getOrDefault(c , 0) + 1);
            
            if(map.get(c) == 2){
                return c;
            }
            
        }
        
        throw new IllegalArgumentException("Invalid Input");
        
    }
}