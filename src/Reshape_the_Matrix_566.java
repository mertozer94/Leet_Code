/**
 * @author Mert Ozer
 */
public class Reshape_the_Matrix_566 {
    public static void main(String[] args){
        int[][] matrix ={   { 20, 18, 22, 20, 16 },
                { 18, 21, 18, 22, 20 },
                { 16, 18, 20, 18, 22 },
                {  25, 16, 18, 20, 18 }
        };
        System.out.println(matrixReshape(matrix, 1, 20));
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        int n = nums.length;
        int m = nums[0].length;

        if (r*c != n*m)
            return nums;

        int[][] matrix = new int[r][c];
        for (int i = 0;i < r*c; i++)
            matrix[i/c][i%c] = nums[i/m][i%m];

        return matrix;
    }
}
