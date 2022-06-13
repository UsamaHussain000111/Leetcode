class Solution{

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();
        int[] res = new int [n + 1];

        for(int i = n - 1 ; i >= 0 ; i--){

            List<Integer> temp = triangle.get(i);

            for(int j = 0 ; j < temp.size(); j++){

                res[j] = Math.min( res[j] , res[j + 1] ) + temp.get(j)  ;

            }
        }
        
         return res[0];
    }

}