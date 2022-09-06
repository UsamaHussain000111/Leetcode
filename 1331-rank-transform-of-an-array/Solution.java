class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] copy = arr.clone();
        Arrays.sort(copy);
        
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        
        int rank = 1;
        
        for(int i : copy){
            
            if(!map.containsKey(i))
                map.put(i , rank++);
        }
        
        for(int i = 0 ; i < arr.length ; i++){
    
            arr[i] = map.get(arr[i]);
        }
            
        
        return arr;
    }
}