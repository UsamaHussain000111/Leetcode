class Solution {
    public String intToRoman(int num) {
        
        HashMap<Integer , Character> map = new HashMap<Integer , Character>();
        
        String[] roman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    	int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        
        int i = 0;
        StringBuilder res = new StringBuilder();

        while(num > 0){
            
            while(num >= values[i]){
                num -= values[i];
                res.append(roman[i]);
            }
            i++;
        }
        
        return res.toString();
    }
}