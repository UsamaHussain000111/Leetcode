class Solution {
    public int fib(int n) {
        
        if(n <= 1)
            return n;
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        int i = 1;
        
        while(i < n){
            
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            
            i++;
            
        }
        
        return secondTerm;
    }
}