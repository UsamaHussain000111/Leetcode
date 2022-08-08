class Solution {
    public List<Integer> findLonely(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        List<Integer> res = new ArrayList<Integer>();
        
        
        for(int num : nums){
            
            map.put( num , map.getOrDefault(num , 0) + 1 );
            
        }
        
        for(int num : map.keySet()){
            
            if(map.get(num) == 1 && !map.containsKey(num + 1) && !map.containsKey(num - 1)){
                res.add(num);
            }
            
        }
        return res;
    }
}