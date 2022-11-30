// using set

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        for(int i = 0 ; i < arr.length ; i++){
            
            if(map.containsKey(arr[i])){
                map.put( arr[i] , map.get(arr[i]) + 1);
            } else{
                map.put(arr[i] , 1);
            }
            
        }
        
        Set<Integer> set = new HashSet<>(map.values());
        
        return map.size() == set.size();
    }
}

// using list

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
        for(int i : arr){
            
            
            if(map.containsKey(i)){
                map.put(i , map.get(i) + 1);
            }else{
                map.put(i , 1);
            }
            
        }
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i : map.keySet()){
            
            int curr = map.get(i);
            if(list.contains(curr))
                return false;
            else
                list.add(curr);
        }
        
        
        return true;
    }
}