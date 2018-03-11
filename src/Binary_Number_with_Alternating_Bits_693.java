/**
 * @author Mert Ozer
 */
public class Binary_Number_with_Alternating_Bits_693 {
    public static void main(String[] args){
        System.out.println(hasAlternatingBits(10));
    }
    public static boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        Character previous = 'a';
        for(Character bit:bits.toCharArray()){
            if(bit == previous)
                return false;
            previous = bit;
        }
        return true;
    }
}
