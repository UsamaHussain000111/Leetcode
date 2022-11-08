class Solution {
    public String makeGood(String s) {
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32)
                stack.pop();
            else
                stack.push(s.charAt(i));
        }
        
        StringBuilder str = new StringBuilder();
        
        for(char c : stack)
            str.append(c);
        
        return str.toString();
    }
}