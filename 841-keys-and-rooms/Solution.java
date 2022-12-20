class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();
        boolean[] visited = new boolean[n];

        visited[0] = true;
        List<Integer> keys = new ArrayList<Integer>(rooms.get(0));

        int k = 0;

        while(k < keys.size()){
            
            int key = keys.get(k);
            if(!visited[key]){
                visited[key] = true;
                keys.addAll(rooms.get(key));
            }
            k++;
        }

        for(int i = 0 ; i < n ; i++){

            if(!visited[i]) return false;
        }

        return true;   
    }
}