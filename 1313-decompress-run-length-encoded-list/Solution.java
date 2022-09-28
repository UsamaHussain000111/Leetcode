class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        
        int[] freq = new int[n / 2];
        int[] value = new int[n / 2];
        
        int len = 0;
        int fIndex = 0;
        
        for(int i = 0 ; i < n - 1; i += 2){
            freq[fIndex] = nums[i];
            value[fIndex] = nums[i + 1];
            fIndex++;
            len += nums[i];
        }
        
        int[] res = new int[len];
        int index = 0;
        
        for(int i = 0 ; i < n / 2 ; i++){
            int f = freq[i];
            int v = value[i];
            for(int j = 0; j < f ; j++){
                res[index] = v;
                index++;
            }
        }
        
        return res;
        
    }
}