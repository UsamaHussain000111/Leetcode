class Solution {

    public int countEven(int num) {
        
        int res = 0;
        
        for(int i = 1 ; i <= num ; i++){
            
            if(sumDigit(i))
                res++;
            
        }
        
        return res;
        
    }
    
    private boolean sumDigit(int n ){
        
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;    
        }
        
        return (sum&1) == 0 ? true : false;
    }
    
}