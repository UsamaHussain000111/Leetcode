class Solution {
    
    int a = 1 , e = 1, i = 1, o = 1 , u = 1 ;
    
    public int countVowelStrings(int n) {
        
        for(int j = 1 ; j < n ; j++){
            increment();
        }
        return a + e + i + o + u;
    }
    
    private void increment(){
        
        a = a + e + i + o + u;
        e = e + i + o + u;
        i = i + o + u;
        o = o + u;
    }
    
}

//There's a special name given to this sequence of numbers. These numbers are known as Pentatope Numbers.

//Definition: A number in the fifth cell of any row of Pascal's triangle starting with the 5-term row 1 4 6 4 1 either 
//from left to right or from right to left.

//The sequence of pentatope numbers is: 1, 5, 15, 35, 70, ... and so on. 
//This sequence also coincides with the outputs for different values of n (in this question).