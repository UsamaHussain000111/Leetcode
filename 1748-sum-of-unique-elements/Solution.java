class Solution {
    public int sumOfUnique(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        int sum = 0;
        
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0) + 1);
            
            // [1 , 2 , 3 , 2] add 2 when its frequency is 1.
            if(map.get(i) == 1)
                sum += i;
            
            // [1 , 2 , 3 , 2] remove 2 when its frequency is 2, since it's a duplicate.
            if(map.get(i) == 2)
                sum -= i;
        }
        
        return sum;
    }
}