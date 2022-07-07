class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        
        int[] res = new int[num_people];
        int currCandy = 1;
        
        while(candies > 0){
          
            for(int i = 0 ; i < num_people ; i++){
                if(candies > currCandy){
                    res[i] += currCandy;
                    candies -= currCandy;
                    currCandy++;
                }else{
                    res[i] += candies;
                    candies = 0;
                }
            }
        }
        return res;
    }
}