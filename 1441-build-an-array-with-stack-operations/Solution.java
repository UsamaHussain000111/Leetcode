class Solution {
    public List<String> buildArray(int[] target, int n) {

        List<String> res = new ArrayList<String>();
        int index = 0;
        int i = 1;
        while(i <= n && index < target.length){
            
            res.add("Push");
            
            if(target[index] == i)
                index++;
            else
                res.add("Pop");
            i++;
        }
        
        return res;
    }
}