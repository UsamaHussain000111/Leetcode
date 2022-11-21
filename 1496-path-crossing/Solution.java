class Solution {
    public boolean isPathCrossing(String path) {
        
        Set<String> set = new HashSet<>();
        set.add("(0,0)");
        
        int x = 0;
        int y = 0;
        
        for(int i = 0 ; i < path.length() ; i++){
            
            if(path.charAt(i) == 'E')
                x++;
            else if(path.charAt(i) == 'W')
                x--;
            else if(path.charAt(i) == 'N')
                y--;
            else
                y++;
            
            String s = "(" + x + "," + y + ")";
            
            if (set.contains(s)) {
                return true;
            } else {        
                set.add(s);
            }
            
        }
        
        return false;
    }
}