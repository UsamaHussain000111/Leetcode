class Solution {
    public String largestWordCount(String[] messages, String[] senders) {
        
        HashMap<String , Integer> map = new HashMap<String , Integer>();
        int sender = 0;
        int max = 0;
        for(int i = 0 ; i < messages.length ;i++){
            
            String[] temp = messages[i].split(" ");
            
            if(map.containsKey(senders[sender])){
                map.put( senders[sender] , map.get(senders[sender]) + temp.length );
            }else{
                map.put( senders[sender] , temp.length );
            }
            
            max = Math.max( max , map.get(senders[sender]) );
            
            sender++;
            
            
        }
        
        String res="";

        for(String e: map.keySet()){
            
            if(map.get(e)==max){
                
                if(res.compareTo(e)<0){
                    res=e;
                }
            }
        }

        return res;
        
    }
}