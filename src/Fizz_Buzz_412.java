import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 */
public class Fizz_Buzz_412 {
    public static void main(String[] args){
        System.out.println(fizzBuzz(15));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= n ; i++){
            Boolean flag = false;
            StringBuilder s = new StringBuilder();
            if(i % 3 == 0){
                s.append("Fizz");
                flag = true;
            }
            if(i % 5 == 0) {
                s.append("Buzz");
                flag = true;
            }
            if (flag)
                list.add(s.toString());
            else {
            s.append(Integer.toString(i));
            list.add(s.toString());
            }
        }
        return list;
    }
}
