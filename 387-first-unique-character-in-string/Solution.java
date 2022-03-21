import java.util.HashMap;

class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character , Integer> hashmap = new HashMap<Character , Integer>();
        
        for(int i = 0; i < s.length()  ; i++){
            if(!hashmap.containsKey(s.charAt(i))){
                hashmap.put(s.charAt(i) , 1);
            } else{
                hashmap.put(s.charAt(i) , hashmap.get(s.charAt(i)) + 1);
            }
        }
        
          for (int i = 0; i < s.length(); i++) {
            if (hashmap.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;       
    }
}