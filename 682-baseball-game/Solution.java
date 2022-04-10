import java.util.Stack;

class Solution {
    
    public int calPoints(String[] ops) {
        
        Stack<Integer> stack = new Stack<Integer>();
        int sum = 0;
        
        for(int i = 0; i < ops.length ; i++){
            
            if(ops[i].equals("C")){
                sum -= stack.pop();
            }else if(ops[i].equals("D")){
                stack.push(2 * stack.peek());
                sum += stack.peek();
            } else if(ops[i].equals("+")) {
                stack.push( stack.get(stack.size() - 1) + stack.get(stack.size() - 2) );
                sum += stack.peek();
            } else {
                stack.push(Integer.parseInt(ops[i]));
                sum += stack.peek();
            }
        }
        return sum;
    }
}