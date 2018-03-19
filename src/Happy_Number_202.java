import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer,
replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1
(where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy numbers.

s
 */
public class Happy_Number_202 {
    public static void main(String[] args){
        System.out.println(isHappy(8));
    }
    public static  boolean isHappy(int n) {
        List<Integer> list = new ArrayList<Integer>();

        while (true){
            int sum = 0;
            for (Character c: Integer.toString(n).toCharArray()){
                sum += Character.getNumericValue(c) * Character.getNumericValue(c);
            }
            if (list.contains(sum))
                return false;
            else if (sum == 1)
                return true;
            list.add(sum);
            n = sum;
        }
    }
}
