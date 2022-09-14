class Solution {
    public List<String> commonChars(String[] words) {
        
        HashMap<Character , Integer> map = new HashMap<Character , Integer>(); 
        
        for(char c : words[0].toCharArray()){
            Integer freq = map.get(c);
            map.put( c , freq == null ? 1 : freq + 1 );     
        }
        
        for(int i = 1 ; i < words.length ; i++){
            
            HashMap<Character , Integer> temp = new HashMap<Character , Integer>();
            
            for(char c : words[i].toCharArray()){
                
                if(map.containsKey(c)){
                    Integer freq = temp.get(c);
                    temp.put( c , Math.min(map.get(c) , (freq == null ? 1 : freq + 1) ) );
                }
            }
            map = temp;
        }
        
        List<String> res = new ArrayList<String>();
        
        for(char c : map.keySet()){
            for (int i = 0; i < map.get(c); i++)
                res.add(String.valueOf(c));
        }
        
        return res;
        
    }
}