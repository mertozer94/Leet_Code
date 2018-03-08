/**
 * @author Mert Ozer
 */
public class Number_Complement_476 {
    public static void main(String[] args){
        System.out.println(findComplement(10));
    }
    public static int findComplement(int num) {
        StringBuilder string = new StringBuilder();
        String s = Integer.toBinaryString(num);
        for(Character c: s.toCharArray()){
            if(c.equals('1'))
                string.append('0');
            else
                string.append('1');
        }
        return Integer.parseInt(string.toString(),2);
    }
}
