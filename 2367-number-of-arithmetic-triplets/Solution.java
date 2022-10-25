class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        
        Set<Integer> set = new HashSet<Integer>();
        int res = 0;
        
        for(int num : nums){
            
            if(set.contains(num - diff) && set.contains(num - diff * 2))
                res++;
            
            set.add(num);
        }
        
        return res;
    }
}

// Explanation:

// You are looking for a triplet of numbers that have:

// indexes i < j < k
// nums[j] - nums[i] == diff and nums[k] - nums[j] == diff
// Example: [1,3,5] diff = 2

// So for example when you get to value 5 you check backward with the set.
// you know 5 - diff = 3, so you check if you visited 3.
// you know 3 - diff = 1, or 5 - 2 * diff = 1. So you check if you visited 1.

// This works because the array is sorted.