// that's not the best solution as it is not fulfilling the follow up
class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> stackOne = new Stack<Character>();
        Stack<Character> stackTwo = new Stack<Character>();
        
        for(int i = 0 ; i < s.length(); i++){
            if(!stackOne.isEmpty() && s.charAt(i) == '#'){
                stackOne.pop();
            }else if(s.charAt(i) != '#'){
                stackOne.push(s.charAt(i));
            }
        }

        for(int i = 0 ; i < t.length(); i++){
            if(!stackTwo.isEmpty() && t.charAt(i) == '#'){
                stackTwo.pop();
            }else if(t.charAt(i) != '#'){
                stackTwo.push(t.charAt(i));
            }
        }
        
        return stackOne.equals(stackTwo);
    }
}