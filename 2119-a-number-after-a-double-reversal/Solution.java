class Solution {
    
    private int reverse(int x){
        int rev = 0;
        while(x != 0){
            rev = (rev * 10) + x % 10;
            x = x / 10;
        }
        return rev;
    }
    
    public boolean isSameAfterReversals(int num) {
        
        int num1;
        int num2;
        
        num1 = reverse(num);
        num2 = reverse(num1);
        
        return num2 == num;
        
    }
}