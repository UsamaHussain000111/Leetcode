// Thanks to Shradha1994 for this simple solution
// link to orignal answer https://leetcode.com/problems/slowest-key/discuss/909070/JAVA-Solution-O(n)-Explained

class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        
        int maxDifference = releaseTimes[0];
        char slowestKey = keysPressed.charAt(0);
        
        for(int i = 1; i < releaseTimes.length ; i++)
        {
            int difference = releaseTimes[i] - releaseTimes[i - 1];
            if(difference > maxDifference || (difference == maxDifference && keysPressed.charAt(i) > slowestKey))
            {
                maxDifference = difference;
                slowestKey = keysPressed.charAt(i);
            }
        }
        
        return slowestKey;
     
    }
}