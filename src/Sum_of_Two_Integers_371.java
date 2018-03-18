/**
 * @author Mert Ozer
 */
public class Sum_of_Two_Integers_371 {
    public static void main(String[] args){
        System.out.println(getSum(4,5));
    }
    public static  int getSum(int a, int b) {
        return Math.abs((-a) - (-b));
    }
}
