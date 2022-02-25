class Solution {
    public boolean checkString(String s) {
        int i = 0;
        while(i < s.length() - 1)
        {
            if(s.charAt(i) == 'b' && s.charAt(i + 1) == 'a')
            {
                return false;
            }
            else
            {
                i++;
            }
        }
        
        return true;
    }
}