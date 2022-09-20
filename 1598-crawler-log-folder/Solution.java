class Solution {
    public int minOperations(String[] logs) {
        
        int folder = 0;
        
        for(int i = 0 ; i < logs.length ; i++){
            
            if(folder == 0 && logs[i].equals("../"))
                continue;
            else if(folder != 0 && logs[i].equals("../"))
                folder--;
            else if(logs[i].equals("./"))
                continue;
            else
                folder++;
        }
        
        return folder;
    }
}