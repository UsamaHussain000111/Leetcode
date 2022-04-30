class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] res = new int[2 * n];
        int l = 0;
        for(int i = 0 ; i < n ; i += 2){
            res[i] = nums[l];
            res[i + 1] = nums[n];
            n++;
            l++;
        }
        
        return res;
    }
}