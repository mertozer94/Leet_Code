/**
 * @author Mert Ozer
 * Given a string and an integer k, you need to reverse the first k characters for every 2k characters counting from the start of the string. If there are less than k characters left, reverse all of them. If there are less than 2k but greater than or equal to k characters, then reverse the first k characters and left the other as original.
Example:
Input: s = "abcdefg", k = 2
Output: "bacdfeg"
Restrictions:
The string consists of lower English letters only.
Length of the given string and k will in the range [1, 10000]
 */
public class Reverse_String_541 {

    public static void main(String [] args)
    {

        System.out.println(reverseStr("hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl",39));

    }
    public static String reverseStr(String s, int k) {


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
