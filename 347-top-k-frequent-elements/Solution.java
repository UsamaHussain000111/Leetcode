import java.util.HashMap;
import java.util.PriorityQueue;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] , map.get(nums[i]) + 1 );
            }else {
                map.put(nums[i] , 1);
            }
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>( (a , b) -> map.get(b) - map.get(a) );
        
        for(int key : map.keySet()){
            pq.add(key);
        }
        
        int[] result = new int[k];
        
        for(int i = 0 ; i < k ; i++){
            result[i] = pq.poll();
        }
        
        return result;
    }
}