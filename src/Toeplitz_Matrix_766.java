/**
 * @author Mert Ozer
 */
public class Toeplitz_Matrix_766 {
    public static void main(String[] args){
        int[][] matrix ={   { 20, 18, 22, 20, 16 },
                            { 18, 21, 18, 22, 20 },
                            { 16, 18, 20, 18, 22 },
                            {  25, 16, 18, 20, 18 }
        };
        System.out.println(isToeplitzMatrix(matrix));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {

        for (int i = 1; i < matrix.length; i++){
          for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i][j] != matrix[i-1][j-1])
                    return false;
          }
        }
        return true;
    }
}
