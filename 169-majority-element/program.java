// a more simple and clean approach from discussion

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