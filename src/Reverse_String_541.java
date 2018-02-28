/**
 * @author Mert Ozer
 */
public class Reverse_String_541 {

    public static void main(String [] args)
    {
        Reverse_String_541 solution = new Reverse_String_541();

        System.out.println(solution.reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",39));
        //System.out.println(solution.reverseStr("abcdefqa",3));

    }
    public String reverseStr(String s, int k) {


        for (int i = 0; i < s.length(); i += 2 * k){

            if (s.substring(i).length() < k)
                s = s.substring(0, i) + reverse(s.substring(i)) ;

            else
                s = s.substring(0, i) + reverse(s.substring(i, i + k)) + s.substring(i + k);
        }
        return s;

    }
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }

}
