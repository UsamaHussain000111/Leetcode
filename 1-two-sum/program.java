import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer , Integer> hash_map = new HashMap<Integer , Integer>(); 
        for(int i = 0 ; i < nums.length; i++)
        {   
            int complement = target - nums[i]; 
            if(hash_map.containsKey(complement))
            {
                return new int[] { hash_map.get(complement) , i };
            }
            
            hash_map.put(nums[i] , i);
        }
        
        throw new IllegalArgumentException("no match found");
    }
}