class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // create a hashmap to keep track of nums[i] index
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        // loop over the array
        for(int i = 0 ; i < nums.length ; i++){
            // if map contains the key(nums[i]) && if i - the index <= k
            if(map.containsKey(nums[i]) && (i - map.get(nums[i]) <= k ) ) {
                return true; //return true
            }
            map.put(nums[i] , i); // keep putting the nums[i] and their last index
        }
        
        return false; // otherwise the answer will always be false
    }
}