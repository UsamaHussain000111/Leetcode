class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int l = 0;
        int r = nums.length - 1;
        
        int[] res = { -1 , -1};
        
        if(nums.length == 0)
            return res;
        
        while(l < r){
            
            int mid = l + (r - l) / 2;
            
            if(nums[mid] < target)
                l = mid + 1;
            else
                r = mid;
            
        }
            
        if(nums[l] != target)
            return res;
        else
            res[0] = l;
        
        
        r = nums.length - 1;
            
        while (l < r){
            int mid = l + (r - l) / 2 + 1;
            if (nums[mid] > target) 
                r = mid - 1;  
            else 
                l = mid;
        }
            
        res[1] = r;
            
        
        return res;
        
    }
}