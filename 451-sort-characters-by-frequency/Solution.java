class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character , Integer> freq = new HashMap<Character , Integer>();
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(!freq.containsKey(s.charAt(i))){
                freq.put( s.charAt(i) , 1 );
            }else{
                freq.put( s.charAt(i) , freq.get(s.charAt(i)) + 1 );
            }
        }
        
        PriorityQueue<Character> pq = new PriorityQueue<Character>(
            (a , b) ->  freq.get(b) - freq.get(a) 
        );
        
        for(char c : freq.keySet()){
            pq.add(c);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!pq.isEmpty()){
            char current = pq.poll();
            int rep = freq.get(current);
            while(rep > 0){
                sb.append(current);
                rep--;
            }
        }
        
        return sb.toString();
        
    }
}