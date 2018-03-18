/**
 * @author Mert Ozer
 */
public class Excel_Sheet_Column_Number_171 {
    public static void main(String[] args){
        System.out.printf(""+titleToNumber("AB"));
    }
    public static int titleToNumber(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        return result;
    }
}
