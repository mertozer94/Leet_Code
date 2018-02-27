/**
 * @author Mert Ozer
 */
public class Reverse_String_541 {

    public static void main(String [] args)
    {
        Reverse_String_541 solution = new Reverse_String_541();

        System.out.println(solution.reverseStr("abcdefg", 2));

    }
    public String reverseStr(String s, int k) {

        if (s.length() < k)
            return reverse(s);
    }
    public static String reverse(String s){
        String newStr = "";
        for (int i = s.length()-1 ; i >= 0; i--){
            newStr += s.charAt(i);
        }
        return newStr;
    }

}
