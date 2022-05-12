class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> setOne = new HashSet<Integer>();
        
        for(int n : nums1){
            setOne.add(n);
        }
        
        HashSet<Integer> setTwo = new HashSet<Integer>();

        for(int n : nums2){
            setTwo.add(n);
        }
        
        ArrayList<Integer> ansOne = new ArrayList<Integer>();
        
        for(int n : setOne){
            if(!setTwo.contains(n)){
                ansOne.add(n);
            }
        } 
        
        ArrayList<Integer> ansTwo = new ArrayList<Integer>();
        
        for(int n : setTwo){
            if(!setOne.contains(n)){
                ansTwo.add(n);
            }
        }
        
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        
        res.add(ansOne);
        res.add(ansTwo);
        
        return res;
        
    }
}