class Solution {
    public int numberOfMatches(int n) {
        int matches = 0;
        int count = 0;
        while(n != 1){
            if(n % 2 == 0){
                matches = n / 2;
                n = n / 2;
                count += matches;
            }else{
                matches = (n - 1) / 2;
                n = (n - 1) / 2 + 1;
                count += matches;
            }
        }
        return count;
    }
}