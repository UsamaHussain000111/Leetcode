class Solution {
    public String removeDigit(String number, char digit) {
        
        String res = "";
        
        for(int i = 0 ; i < number.length() ; i++){
            
            if(number.charAt(i) == digit){
                String t = number.substring(0 , i) + number.substring(i + 1);
                if(t.compareTo(res) > 0)
                    res = t;
            }
            
        }
        return res;
    }
}