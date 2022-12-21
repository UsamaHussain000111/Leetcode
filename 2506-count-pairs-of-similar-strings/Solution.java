class Solution {
    public int similarPairs(String[] words) {
        
        int res = 0;
        for(int i = 0 ; i < words.length - 1; i++){
            for(int j = i + 1; j < words.length ; j++){
                res += check(words[i] , words[j]);
            }
        }
        return res;
    }

    public int check(String word1 , String word2){
        Set<Character> set1 = new HashSet<Character>();
        for(char c : word1.toCharArray()) set1.add(c);
        Set<Character> set2 = new HashSet<Character>();
        for(char c : word2.toCharArray()) set2.add(c);
        return set1.equals(set2) ? 1 : 0;
    }
}