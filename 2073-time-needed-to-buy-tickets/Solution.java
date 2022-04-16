class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int sec = 0;
        int i = 0;
        while(tickets[k] != 0){
            
            if(tickets[i] != 0){
                tickets[i] = tickets[i] - 1;
                sec++;
            }
            
            if(i == tickets.length - 1){
                i = 0;
                continue;
            }
            i++;
        }
        return sec;
    }
}