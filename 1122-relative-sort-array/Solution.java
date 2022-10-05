class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        for(int i : arr2){
            
            map.put( i , 0);
            
        }
        
        int[] res = new int[arr1.length];
        int lastIndex = arr1.length - 1;
        
        for(int i : arr1){
            
            if(map.containsKey(i)){
                map.put( i , map.get(i) + 1);
            }else{
                res[lastIndex--] = i;
            }
            
        }
        
        int startIndex = 0;
        
        for(int i = 0 ; i < arr2.length ; i++){
            
            int curr = map.get(arr2[i]);
            for(int j = 0 ; j < curr ; j++){
                res[startIndex++] = arr2[i];
            }
        }
        
        Arrays.sort(res, startIndex, res.length);
        
        return res;
        
    }
}