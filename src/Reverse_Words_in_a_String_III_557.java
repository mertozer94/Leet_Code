/**
 * @author Mert Ozer
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
