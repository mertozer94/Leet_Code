import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

Note: Do not use any built-in library function such as sqrt.

Example 1:

Input: 16
Returns: True
Example 2:

Input: 14
Returns: False
 */
public class Valid_Perfect_Square_367 {
    public static void main(String[] args){
        int[] nums = {0,1,3,4,9,16,64,100,67,264234,1000000};
        long startTime = System.nanoTime();
        for (int num:nums)
            System.out.println(isPerfectSquare(num));
        long endTime = System.nanoTime();

        long startTime1 = System.nanoTime();
        for (int num:nums)
            System.out.println(isPerfectSquare1(num));
        long endTime1 = System.nanoTime();

        System.out.println(endTime-startTime);
        System.out.println(endTime1-startTime1);


    }
    public static boolean isPerfectSquare(int num) {
        int sum = 1;
        int l = 3;
        while (true){
            if (sum == num)
                return true;
            else if (num < sum)
                return false;
            sum += l;
            l += 2;
        }
    }
    public static boolean isPerfectSquare1(int num){

        List list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(9);
        list.add(16);
        list.add(25);
        list.add(36);
        list.add(49);
        list.add(64);
        list.add(81);
        list.add(100);

        if (list.contains(num))
            return true;
        for (int i = 0 ; i < num/10; i++){
            if (i * i == num)
                return true;
        }
        return false;
    }
}
