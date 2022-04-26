class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        ArrayList<Boolean> output = new ArrayList<Boolean>();
        int max = candies[0];
        
        for(int i = 0 ; i < candies.length ; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }
        
        for(int i = 0 ; i < candies.length ; i++){
            if(candies[i] + extraCandies >= max){
                output.add(true);
            }else{
                output.add(false);
            }
        }
        
        return output;
    }
}