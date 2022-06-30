class Solution {
    public boolean strongPasswordCheckerII(String password) {
        
        if(checkLength(password) && checkLowercase(password) && checkUppercase(password) && checkDigit(password) && checkSpecialCharacter(password) && checkAdjacent(password))
            return true;
        
        
        return false;
        
        
    }
    
    private boolean checkLength(String s){
        
        if(s.length() < 8)
            return false;
        
        return true;
    }
    
     private boolean checkLowercase(String s){
         
         for(int i = 0 ; i < s.length() ; i++){
            
            if( s.charAt(i) >= (char)(97) && s.charAt(i) <= (char)(122) )
                return true;
             else
                 continue;
        }
         
         return false;
    }
    
    private boolean checkUppercase(String s){
         
         for(int i = 0 ; i < s.length() ; i++){
            
            if( s.charAt(i) >= (char)(65) && s.charAt(i) <= (char)(90) )
                return true;
             else
                 continue;
        }
         
         return false;
    }
    
     private boolean checkDigit(String s){
         
         List<Integer> list = new ArrayList<Integer>();
         list.add(0);
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         list.add(6);
         list.add(7);
         list.add(8);
         list.add(9);
         
         for(int i = 0 ; i < s.length() ; i++){
            
            if(list.contains(Character.getNumericValue(s.charAt(i))))
                return true;
             else
                 continue;
        }
         
         return false;
    }
    
    private boolean checkSpecialCharacter(String s){
         
         List<Character> list = new ArrayList<Character>();
         list.add('!');
         list.add('@');
         list.add('#');
         list.add('$');
         list.add('%');
         list.add('^');
         list.add('&');
         list.add('*');
         list.add('(');
         list.add(')');
         list.add('-');
         list.add('+');
         
         for(int i = 0 ; i < s.length() ; i++){
            
            if(list.contains(s.charAt(i)))
                return true;
             else
                 continue;
        }
         
         return false;
    }
    
    private boolean checkAdjacent(String s){
         
         for(int i = 0 ; i < s.length() - 1; i++){
            
            if(s.charAt(i) == s.charAt(i + 1))
                return false;
        }
         
         return true;
    }
    
}