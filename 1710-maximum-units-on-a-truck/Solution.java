class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        
        Arrays.sort( boxTypes , (a , b) -> b[1] - a[1] );
        int maxUnits = 0;
        
        for(int[] box : boxTypes){
            
            int curr = Math.min( box[0] , truckSize ); 
            maxUnits += box[1] * curr;
            truckSize -= curr;
            if(truckSize == 0) return maxUnits;
        }
        
        return maxUnits;
    }
}