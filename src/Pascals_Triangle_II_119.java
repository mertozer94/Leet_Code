import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 */
public class Pascals_Triangle_II_119 {
    public static void main(String[] args){
        List list = getRow(2);
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
    public static List<Integer> getRow(int rowIndex) {

        List<Integer> pRow = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++){
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
        return pRow;
    }
}
