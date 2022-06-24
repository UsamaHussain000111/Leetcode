class Solution {
    public boolean isPossible(int[] target) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( (a , b) -> (b - a) );
        
        long total = 0;
        
        for(int i : target){
            total += i;
            pq.add(i);
        }
        
        while(true){
            
            int curr = pq.poll();
            total -= curr;
            
            if(curr == 1 || total == 1)
                return true;
            
            if(curr < total || total == 0 || curr % total == 0)
                return false;
            
            curr %= total;
            total += curr;
            
            pq.add(curr);
                
        }
               
    }
}