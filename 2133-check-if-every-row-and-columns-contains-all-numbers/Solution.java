import java.util.HashSet;

class Solution {
    public boolean checkValid(int[][] matrix) {
        for(int i = 0; i < matrix.length ; i++)
        {
            HashSet<Integer> row = new HashSet<Integer>();
            HashSet<Integer> col = new HashSet<Integer>();
            for(int j = 0 ; j < matrix.length ; j++)
            {
                if(!row.add(matrix[i][j]) || !col.add(matrix[j][i]))
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}