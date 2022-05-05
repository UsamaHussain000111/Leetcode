class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        ArrayList<String> temp = new ArrayList<String>();
        
        int count = 0;
        
        StringBuilder str = new StringBuilder("");
        
        for(int i = 0 ; i < s.length() ; i++){
            
            count++;
            str.append(s.charAt(i));
            
            if(count == k){
                temp.add(str.toString());
                count = 0;
                str.setLength(0);
            }
            
            if(i == s.length() - 1 && str.length() < k && str.length() != 0){
            
                while(str.length() != k){
                    str.append(fill);
                }
                
                temp.add(str.toString());
            }
            
        }
        
        String[] myArray = new String[temp.size()];
        temp.toArray(myArray);
        
        return myArray;

    }
}