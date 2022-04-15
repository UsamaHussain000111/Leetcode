class Solution {
    public int maxPower(String s) {
        char last = ' ';
        int maxSum = 0;
        int sum = 0;
        
        for(int i = 0 ; i < s.length()  ; i++){
           
            if(s.charAt(i) == last){
                sum++;
            } else {
                sum = 1;
                last = s.charAt(i);
            }
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }
}