class Solution {
    public List<String> printVertically(String s) {
        
        List<String> res = new ArrayList<String>();
        String[] words = s.split(" ");
        int max = 0;
        
        for(int i = 0 ; i < words.length ; i++){
            if(max < words[i].length()){
                max = words[i].length();
            }
        }
        
        for(int i = 0 ; i < max; i++){
            
            StringBuilder sb = new StringBuilder();
            
            for(String word : words){
                
                sb.append( i < word.length() ? word.charAt(i) : " " );
                
            }
            
            while(sb.charAt(sb.length() - 1) == ' '){
                sb.deleteCharAt(sb.length() - 1);
            }
            res.add(sb.toString());
        }
        return res;
    }
}