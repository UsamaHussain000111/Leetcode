// My solution using hash map
// Runtime: 9 ms, faster than 34.33% :(
// Memory Usage: 47.1 MB, less than 82.71% :/

class Solution {
    public int majorityElement(int[] nums) {
        
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length ; i++)
        {
            if(!counts.containsKey(nums[i]))
            {
                counts.put(nums[i] , 1);
            }
            else
            {
                counts.put(nums[i] ,  counts.get(nums[i]) + 1);
            }
        }
        
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if(majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}