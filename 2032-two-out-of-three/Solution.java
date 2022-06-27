class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        Set<Integer> set3 = new HashSet<Integer>();
        
        List<Integer> res = new ArrayList<Integer>();
        
        for(int i : nums1){
            set.add(i);
            set1.add(i);
        }
        
        for(int i : nums2){
            set.add(i);
            set2.add(i);
        }
        
        for(int i : nums3){
            set.add(i);
            set3.add(i);
        }
        
        for(int i : set){
            if(set1.contains(i) && set2.contains(i) || set1.contains(i) && set3.contains(i) || set2.contains(i) && set3.contains(i)){
                res.add(i);
            }
        }
        
        
        return res;
    }
}