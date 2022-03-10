import java.util.HashMap;

class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        HashMap<String , Integer> map1 = new HashMap<String , Integer>();
        HashMap<String , Integer> map2 = new HashMap<String , Integer>();

        for(int i = 0; i < words1.length ; i++){
            if(!map1.containsKey(words1[i])){
                map1.put(words1[i], 1);
            } 
            else {
                map1.put(words1[i], map1.get(words1[i]) + 1);
            }
        }
        
        for(int j = 0; j < words2.length ; j++){
            if(!map2.containsKey(words2[j])){
                map2.put(words2[j], 1);
            } 
            else {
                map2.put(words2[j], map2.get(words2[j]) + 1);
            }
        }
        
        int count = 0;
        
        for(int k = 0; k < words1.length ; k++){
            if(map1.get(words1[k]) == map2.get(words1[k]) && map1.get(words1[k]) == 1){
                count++;
            }
        }
        
        return count;
        
    }
}