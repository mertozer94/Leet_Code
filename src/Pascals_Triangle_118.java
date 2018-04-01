import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
[1],
[1,1],
[1,2,1],
[1,3,3,1],
[1,4,6,4,1]
]
 */
public class Pascals_Triangle_118 {
    public static void main(String[] args){
        generate(5);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<Integer> pRow = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j < i+1; j++){
                if (j == 0 || j ==i)
                    row.add(1);
                else {
                    row.add(pRow.get(j-1)+pRow.get(j));
                }
            }
            list.add(row);
            pRow = row;
        }
        return list;
    }
}
