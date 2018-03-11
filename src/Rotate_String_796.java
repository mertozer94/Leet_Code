/**
 * @author Mert Ozer
 */
public class Rotate_String_796 {
    public static void main(String[] args){
        System.out.println(rotateString("abcde","cdeab"));
    }
    public static boolean rotateString(String A, String B) {
        if(A.length() == B.length())
            return (A+A).contains(B);
        return false;
    }
}
