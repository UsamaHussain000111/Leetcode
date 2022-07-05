class Solution {

    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        for(int num : nums){
            set.add(num);
        }

        int longestStreak = 0;

        for(int num : nums){

            if(!set.contains(num - 1)){

                int currNum = num;
                int currStreak = 1;

                while(set.contains(currNum + 1)){
                    currStreak++;
                    currNum++;
                }

                longestStreak = Math.max(currStreak , longestStreak);
            }
        }
        
        return longestStreak;
    }
}