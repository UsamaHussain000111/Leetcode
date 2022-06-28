class Solution {
    public int minDeletions(String s) {
        HashMap<Character , Integer> map = new HashMap<Character , Integer>();
        for(int i = 0  ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                map.put( c , map.get(c) + 1 );
            }else{
                map.put(c , 1);
            }
        }
        HashSet<Integer> set = new HashSet<Integer>();
        int del = 0;
        for(int i : map.values()){
            while(i != 0 && set.contains(i)){
                i--;
                del++;
            }
            set.add(i);
        }
        return del;
    }
}