class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    
        HashSet<Integer> list = new HashSet<Integer>();
        HashSet<Integer> res = new HashSet<Integer>();
        
        for(int i = 0 ; i < nums1.length ; i++){
            list.add(nums1[i]);
        }
        
        for(int i = 0 ; i < nums2.length ; i++){
            if(list.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }
        
        int[] output = new int[res.size()];
        int i = 0;
        for (Integer num : res) {
            output[i++] = num;
        }
        return output;
    }
}