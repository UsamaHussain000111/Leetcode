// Solution 1, using stack
// Runtime: 70 ms, faster than 65.82%, Memory Usage: 53.4 MB, less than 59.40%

class Solution {
    public String removeDuplicates(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        for(int i = 0 ; i < s.length() ; i++){
            
            if(!stack.isEmpty() && stack.peek() == s.charAt(i)){
                stack.pop();
                continue;
            }
            
            stack.push(s.charAt(i));
        }
        
        StringBuilder res = new StringBuilder();
        
        for(char c : stack){
            res.append(c);
        }
        
        return res.toString();
        
    }
}

// Solution 2, using two pointers
// Runtime: 4 ms, faster than 100.00%, Memory Usage: 42.4 MB, less than 99.55%

class Solution {

    public String removeDuplicates(String s) {

       int i = 0, n = s.length();
       char[] res = s.toCharArray();

       for (int j = 0; j < n; ++j, ++i) {
           res[i] = res[j];
           if (i > 0 && res[i - 1] == res[i]) // count = 2
               i -= 2;
       }

       return new String(res, 0, i);
   }
}

// Solution 3, using StringBuilder
// Runtime: 21 ms, faster than 86.61%, Memory Usage: 49.5 MB, less than 67.59%

class Solution {

    public String removeDuplicates(String S) {

     StringBuilder sb = new StringBuilder();
     
     for (char c : S.toCharArray()) {

         int size = sb.length();

         if (size > 0 && sb.charAt(size - 1) == c) {
             sb.deleteCharAt(size - 1);
         } else {
             sb.append(c);
         }
     }

     return sb.toString();
 }
}