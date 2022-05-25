class Solution {
    public boolean divideArray(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for(int i : nums){   
            if(!seen.add(i)){
                seen.remove(i);
            }
            
        }  
        return seen.isEmpty();
    }
}