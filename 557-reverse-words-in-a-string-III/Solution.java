class Solution {
    public String reverseWords(String s) {
        
        int n = s.length();
        // convert the String s to char array
        char[] charArray = s.toCharArray();
        // lastIndex will keep track of every word last index
        int lastIndex = -1;
        
        for(int i = 0 ; i <= n ; i++){
            
            // if i = n means last word, and charArray[i] marks the end of a word
            if(i == n || charArray[i] == ' '){
                // start index of a word i.e 1st iteration : - 1 + 1 = 0.
                int startIndex = lastIndex + 1;
                // last index is gonna be current index (i) which is a space - 1.
                // if i == n, then its gonna be last index i - 1.
                int endIndex = i - 1;
                // iterate over the word 
                while(startIndex < endIndex){
                    //simple swapping
                    char temp = charArray[startIndex];
                    charArray[startIndex] = charArray[endIndex];
                    charArray[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }
                // set the last index to i i.e 1st iteration : 5.
                lastIndex = i;
            }
        }
        
        return new String(charArray);
    }
}