class Solution {
    //Tc: O(m+n)
    public boolean searchMatrix(int[][] matrix, int target) {
    if(matrix.length == 0 || matrix == null ) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = n-1;
        while(i < m && j >=0)
        {
            if(matrix[i][j] == target) return true;
            if(matrix[i][j] < target)
            {
                i++;

            }
            else
            {
                j--;
            }
        }
        return false;

        
    }
}