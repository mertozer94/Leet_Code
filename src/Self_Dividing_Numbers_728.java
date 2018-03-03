import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 */
public class Self_Dividing_Numbers_728 {
    public static void main(String[] args){
        System.out.println(selfDividingNumbers(1,22));
    }
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++){
            Boolean changed = false;
            if (Integer.toString(i).contains("0"))
                continue;
            String s = Integer.toString(i);
            for (Character c: s.toCharArray()){
                if (i % Character.getNumericValue(c) != 0){
                    changed = true;
                    break;
                }
            }
            if (!changed)
                list.add(i);
        }
        return list;
    }
}
