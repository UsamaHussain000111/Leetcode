class Solution {
    public String convertToTitle(int columnNumber) {
        
        String res = "";
        while(columnNumber != 0){

            if(columnNumber % 26 == 0){
                res = 'Z' + res;
                columnNumber = columnNumber / 26 - 1;
            }else{
                res = (char)(columnNumber % 26 + 'A' - 1) + res;
                columnNumber = columnNumber/ 26;
            }
            
        }
        return res;
    }
}

// explanation from : https://leetcode.com/hucraig/

// The goal of this problem is to convert base10 system to base26 system.
// Excel sheet base26 system is represented by the 26 capital letters. Note this system has no concept of 0. Similar to Roman numerals, where 0 does not exist. I.E. X = 10. XI = 11.

// In a base10 system, 58 is
// 10 * 5 + 8.
// 58 is represented by the sixth digit, and the ninth digit in the base10 system where 0 does exist.

// In base26 system, the number 58 is actually
// 26 * 2 + 6.
// Therefore, it is represented by the second letter + the sixth letter, which is 'BF' in this case.

// Conclusively, we can keep modding/dividing to get the last character in the base26 system.