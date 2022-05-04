class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        int res = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int comp = k - nums[i];
            if(map.containsKey(comp) && map.get(comp) > 0 ){
                res++;
                map.put(comp , map.get(comp) -1 );
            }else{
                map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1 );
            }
        }
        
        return res;
    }
}