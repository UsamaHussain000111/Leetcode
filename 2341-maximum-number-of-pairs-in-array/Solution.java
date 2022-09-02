class Solution {
    public int[] numberOfPairs(int[] nums) {
        
        int n = nums.length;
        int pair = 0;
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        for(int i : nums){
            
            map.put( i , map.getOrDefault(i , 0) + 1 );
            
            if(map.get(i) == 2){
                pair++;
                map.put(i , 0);
            }
        }
        
        int unpair = 0;
        
        for(int i : map.keySet()){
            if(map.get(i) != 0)
                unpair++;
        }
            
        return new int[] {pair , unpair};
    }
} {
    
}
