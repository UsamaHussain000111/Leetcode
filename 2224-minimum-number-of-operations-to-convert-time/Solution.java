class Solution {
    public int convertTime(String current, String correct) {
        
        int count = 0;
        
        String curr[] = current.split(":");
        String corr[] = correct.split(":");
        
        // convert time into minutes
        int cur = Integer.parseInt(curr[0]) * 60 + Integer.parseInt(curr[1]);
        int cor = Integer.parseInt(corr[0]) * 60 + Integer.parseInt(corr[1]);
        
        // Increase current time by 60min until it becomes just less or equal to correct time.
        while(cur + 60 <= cor) {
            count++;
            cur += 60;
        }
        
        // Similarly do the same thing with 15min, 5min, and 1min window.
        // Count the number of iterations performed.
         while(cur + 15 <= cor) {
            count++;
            cur += 15;
        }
        
         while(cur + 5 <= cor) {
            count++;
            cur += 5;
        }
        
         while(cur + 1 <= cor) {
            count++;
            cur += 1;
        }
        
        // Return the number of iterations.
        return count;
    }
}