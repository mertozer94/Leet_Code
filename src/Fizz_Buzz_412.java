import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 * Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.
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
