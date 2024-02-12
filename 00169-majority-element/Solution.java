class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums)
            map.put(num , map.getOrDefault(num , 0) + 1);

        int max = 0;

        for(int i : map.keySet()){

            int curr = map.get(i);

            if(curr > (nums.length / 2))
                max = i;
        }

        return max;
    }
}

// with O(1) space

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int current = nums[0];
        for(int i = 0; i< nums.length;i++){
			if(count <= 0){
				current = nums[i]; 
				count = 0;
			}
			if(current == nums[i])
				count++;
			if(current != nums[i])
				count--;
        }  
    return current;
    }
}