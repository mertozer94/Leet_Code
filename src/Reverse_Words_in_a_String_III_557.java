/**
 * @author Mert Ozer
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class Reverse_Words_in_a_String_III_557 {
    public static void main(String[] args){
        System.out.println(reverseWords("Let's take LeetCode contest"));

    }
    public static String reverseWords(String s) {
        StringBuilder string = new StringBuilder();
        for(String word:s.split(" ")){
            string.append(new StringBuilder(word).reverse().toString());
            string.append(" ");
        }
        return string.substring(0,string.length()-1).toString();
    }
}
