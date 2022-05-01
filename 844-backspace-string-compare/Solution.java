// that's not the best solution as it is not fulfilling the follow up, it's not o(1) space
// it's just what I came up with at the first 45 mins
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stackOne = new Stack<Character>();
        Stack<Character> stackTwo = new Stack<Character>();
        
        StringBuilder sbS = new StringBuilder("");
        StringBuilder sbT = new StringBuilder("");
        
        for(int i = 0 ; i < s.length(); i++){
            if(!stackOne.isEmpty() && s.charAt(i) == '#'){
                stackOne.pop();
            }else if(s.charAt(i) != '#'){
                stackOne.push(s.charAt(i));
            }
        }
    
        for(int i = 0 ; i < stackOne.size() ; i++){
            if(!stackOne.isEmpty()){
                sbS.append(stackOne.get(i));
            }
        }

        for(int i = 0 ; i < t.length(); i++){
            if(!stackTwo.isEmpty() && t.charAt(i) == '#'){
                stackTwo.pop();
            }else if(t.charAt(i) != '#'){
                stackTwo.push(t.charAt(i));
            }
        }
    
        for(int i = 0 ; i < stackTwo.size() ; i++){
            if(!stackTwo.isEmpty()){
                sbT.append(stackTwo.get(i));
            }
        }
        
        return sbS.toString().equals(sbT.toString());
    }
}