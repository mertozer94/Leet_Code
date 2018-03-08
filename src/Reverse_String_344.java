import java.util.Arrays;

/**
 * @author Mert Ozer
 */
public class Reverse_String_344 {
    public static void main(String[] args){
        System.out.println(reverseString("hello"));

    }
    public static String reverseString(String s) {
        //return new StringBuilder(s).reverse().toString();
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() -1;

        while (i < j){

            char tmp = chars[i];
            chars[i] = chars [j];
            chars[j] = tmp;
            i++;
            j--;
        }
        return new String(chars);
    }
}
