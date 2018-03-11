/**
 * @author Mert Ozer
 */
public class Island_Perimeter_436 {
    public static void main(String[] args){

        int[][] matrix = {
                            {0, 1, 0, 0, 0},
                            {1, 1, 1, 0, 0},
                            {0, 1, 0, 0, 0},
                            {1, 1, 0, 0, 0}

        };
        int[][] m = {
                {1,0}

        };
        System.out.println(islandPerimeter(m));
    }
    public static int islandPerimeter(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i ++)
            for (int j = 0; j < grid.length; j ++){
                if (grid[i][j] == 1){
                    if (j == 0 || grid[i][j-1] == 0)//left
                        count++;
                    if (i == 0 || grid[i-1][j] == 0)//up
                        count++;
                    if (j == grid[0].length-1 || grid[i][j+1] == 0)//right
                        count++;
                    if (i == grid.length-1 || grid[i+1][j] == 0)//down
                        count++;
                }
            }

        return count;
    }
}
