/**
 * @author Mert Ozer
 *
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.

Example 1:

Input:
[
[1,1,1],
[1,0,1],
[1,1,1]
]
Output:
[
[1,0,1],
[0,0,0],
[1,0,1]
]
Example 2:

Input:
[
[0,1,2,0],
[3,4,5,2],
[1,3,1,5]
]
Output:
[
[0,0,0,0],
[0,4,5,0],
[0,3,1,0]
]
Follow up:

A straight forward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
 */
public class Set_Matrix_Zeroes_73 {
    public static void main(String[] args) {
        int[][] test = {
        {
            1, 1, 1
        },
        {
            1, 0, 1
        },
        {
            1, 1, 1
        }
    };
        setZeroes(test);
        System.out.println("");

    }
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] newMatrix = new int[m][n];

        for(int i = 0; i < m; i ++)
            for(int j = 0; j < n; j++)
                newMatrix[i][j] = matrix[i][j];


        for(int i = 0; i < m; i ++)
            for(int j = 0; j < n; j++){
                if (matrix[i][j] == 0){
                    setZeroesRow(newMatrix, i, j, m, n, 1);
                    setZeroesRow(newMatrix, i, j, m, n, -1);
                    setZeroesColumn(newMatrix, i, j, m, n, 1);
                    setZeroesColumn(newMatrix, i, j, m, n, -1);
                }
            }
        for(int i = 0; i < m; i ++)
            for(int j = 0; j < n; j++)
                matrix[i][j] = newMatrix[i][j];
    }
    public static void setZeroesRow(int[][] matrix, int i, int j, int m, int n, int sign) {
        if (i < 0 || j < 0 || i >= m || j >=n )
            return;
        else {
            matrix[i][j] = 0;
            setZeroesRow(matrix, i+sign, j, m, n, sign);
        }
    }

    public static void setZeroesColumn(int[][] matrix, int i, int j, int m, int n, int sign) {
        if (i < 0 || j < 0 || i >= m || j >=n )
            return;
        else {
            matrix[i][j] = 0;
            setZeroesColumn(matrix, i, j+sign, m, n, sign);
        }
    }
}
