import java.util.HashMap;
import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> hashmap = new HashMap<Integer , Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        
        for(int num : nums2){
            while(!stack.isEmpty() && stack.peek() < num){
                hashmap.put(stack.pop() , num);
            }
            stack.push(num);
        }
        
        for(int i = 0 ; i < nums1.length ; i++){
            nums1[i] = hashmap.getOrDefault(nums1[i] , -1);
        }
        return nums1;
    }
}