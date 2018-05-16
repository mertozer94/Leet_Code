/**
 * @author Mert Ozer
 *
 * Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 */
public class Add_Binary_67 {
    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() -1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (j >= 0)
                sum += b.charAt(j--) - '0';
            if (i >= 0)
                sum += a.charAt(i--) - '0';

            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry != 0)
            result.append(carry);

        return result.reverse().toString();
    }
    public static void main(String[] args){
        System.out.println(addBinary("11","1"));
        System.out.println(addBinary("1010","1011"));

    }
}
