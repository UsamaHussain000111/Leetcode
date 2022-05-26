class Solution {
    public int[] frequencySort(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i] , 1);
            }else{
                map.put( nums[i] , map.get(nums[i]) + 1 );
            }
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( 
              (a, b) -> map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b) 
        );
        
        for(int key : map.keySet() ){
            pq.add( key );
        }
        
        int[] res = new int[nums.length];
        int i = 0;
        while(!pq.isEmpty() ){
            int curr = pq.poll();
            int freq = map.get(curr);
            while(freq > 0){
                res[i] = curr;
                freq--;
                i++;
            }
        }
        
        return res;       
    }
}