// Brute Force

class Solution {
    public int countKDifference(int[] nums, int k) {
        
        int res = 0;
        
        for(int i = 0 ; i < nums.length - 1 ; i++){
            
            for(int j = i + 1 ; j < nums.length ; j++){
                int c = Math.abs(nums[i] - nums[j]);
                if(c == k)
                    res++;
            }
        }
        return res;
    }
}

// Using Hashmap

class Solution {
    public int countKDifference(int[] nums, int k) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        int res = 0;
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(map.containsKey(nums[i] - k)){
                res += map.get(nums[i] - k);
            }
            
            if(map.containsKey(nums[i] + k)){
                res += map.get(nums[i] + k);
            }
            
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
            
        }
    
        return res;
    }
}