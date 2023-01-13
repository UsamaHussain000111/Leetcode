class Solution {
    public int distributeCandies(int[] candyType) {

        Set<Integer> set = new HashSet<Integer>();
        int max = candyType.length / 2;

        for(int i : candyType){
            set.add(i);
            if(set.size() > max)
                return max;
        }

        return set.size();        
    }
}