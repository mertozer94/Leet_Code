/**
 * @author Mert Ozer
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

Note: You can only move either down or right at any point in time.

Example:

Input:
[
[1,3,1],
[1,5,1],
[4,2,1]
]
Output: 7
Explanation: Because the path 1→3→1→1→1 minimizes the sum.

 */
public class Minimum_Path_Sum_64 {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i ++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = Integer.MAX_VALUE;
        return minPathSum(grid, 0, 0, m, n, matrix);
    }
    public int minPathSum(int[][] grid, int i, int j, int m, int n, int[][] matrix) {
        if (i < 0 || j < 0 || i >= m || j >=n )
            return Integer.MAX_VALUE;
        else if (i == m -1 && j == n-1)
            return grid[i][j];
        else if(matrix[i][j] == Integer.MAX_VALUE){
            matrix[i][j] = grid[i][j] + Math.min(minPathSum(grid, i+1, j, m, n, matrix), minPathSum(grid, i, j+1, m, n, matrix));
            return matrix[i][j];
        }
        else
            return matrix[i][j];
    }
}
