class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        
        HashMap<Integer , Integer> loss = new HashMap<Integer , Integer>();
        
        for(int i = 0 ; i < matches.length ; i++){
            
            int winner = matches[i][0];
            int loser = matches[i][1];
            
            loss.put(winner , loss.getOrDefault(winner , 0) );
            loss.put(loser , loss.getOrDefault(loser , 0) + 1 );
        }
        
        List<List<Integer>> res = Arrays.asList(new ArrayList<>(), new ArrayList<>());

        for(Integer player : loss.keySet())
            if (loss.get(player) == 0)
                res.get(0).add(player);
            else if (loss.get(player) == 1)
                res.get(1).add(player);
        

        Collections.sort(res.get(0));
        Collections.sort(res.get(1));
        
        return res;
    }
}