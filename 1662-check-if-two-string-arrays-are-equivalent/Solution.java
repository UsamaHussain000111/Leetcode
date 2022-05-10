// not the optimal solution as the space complexity is linear and we are itreating through the whole array
// for checking if w1 is equal to w2. check out @chloewlin solution for the optimal solution here:
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/discuss/967572/Java-4-pointers-and-Iterator-Solution-Doing-it-in-O(1)-space-is-the-trick
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        
        for(int i = 0 ; i < word1.length ; i++){
            
            w1.append(word1[i]);
            
        }
        
        for(int i = 0 ; i < word2.length ; i++){
            
            w2.append(word2[i]);
            
        }
        
        return w1.toString().equals(w2.toString());
        
    }
}