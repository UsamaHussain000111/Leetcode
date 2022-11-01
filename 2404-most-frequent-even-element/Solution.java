class Solution {
    public int mostFrequentEven(int[] nums) {
        
        int res = -1;
        
        if(nums.length == 0)
            return res;
        
        // map to keep the frequency
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        for(int i = 0 ; i < nums.length ; i++){
            
            if(nums[i] % 2 == 0){
                if(map.containsKey(nums[i])){
                    map.put(nums[i] , map.get(nums[i]) + 1);
                }else{
                    map.put(nums[i] , 1);
                }
            }
        }
        
        // to keep track of the greatest frequency
        int maxFreq = -1;
        
        for(int num : map.keySet()){
            // if the frequency is greater than current frequency
            if(map.get(num) > maxFreq){ 
                maxFreq = map.get(num); // update frequency
                res = num; // update res
            }else if(map.get(num) == maxFreq && res > num){ // if the frequency is equal, select the minimum number
                res = num;
            }
        }
        
        return res;
    }
}