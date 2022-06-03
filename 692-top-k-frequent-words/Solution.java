class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String , Integer> map = new HashMap<String , Integer>();
        
        for(int i = 0 ; i < words.length ; i++){
            if(map.containsKey(words[i])){
                map.put( words[i] , map.get(words[i]) + 1 );
            }else{
                map.put( words[i] , 1 );
            }
        }
        
        PriorityQueue<String> pq = new PriorityQueue<String>(
            (a , b) -> map.get(a) == map.get(b) ? a.compareTo(b) : map.get(b) - map.get(a)
        );
        
        for(String s : map.keySet()){
            pq.add(s);
        }
        
        List<String> res = new ArrayList<String>();
        
        for(int i = 0 ; i < k ; i++){
            res.add(pq.poll());
        }
        
        return res;
    }
}