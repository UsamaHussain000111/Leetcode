class Solution {
    public int lengthOfLastWord(String s) {
        String stripped = s.trim();
        int length = 0;
        for(int i = stripped.length() -1 ; i >= 0 ; i--)
        {
            if(stripped.charAt(i) != ' ')
            {
                length++;
            }
            else
            {
                break;
            }
        }
        return length;
    }
}