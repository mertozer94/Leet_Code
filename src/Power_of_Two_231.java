/**
 * @author Mert Ozer
 * Given an integer, write a function to determine if it is a power of two.
 */
public class Power_of_Two_231 {
    public static void main(String[] args){
        int[] nums = {0,1,2,4,6,8,16,256,64,65};
        for(int num:nums)
            System.out.println(isPowerOfTwo(num));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0)
            return false;

        else if (n == 1)
            return true;

        else if (n % 2 == 0)
            return isPowerOfTwo(n /2);

        return false;
    }
    /*
    *   faster solution
    *   If n is the power of two:

n = 2 ^ 0 = 1 = 0b0000…00000001, and (n - 1) = 0 = 0b0000…0000.
n = 2 ^ 1 = 2 = 0b0000…00000010, and (n - 1) = 1 = 0b0000…0001.
n = 2 ^ 2 = 4 = 0b0000…00000100, and (n - 1) = 3 = 0b0000…0011.
n = 2 ^ 3 = 8 = 0b0000…00001000, and (n - 1) = 7 = 0b0000…0111.
we have n & (n-1) == 0b0000…0000 == 0

Otherwise, n & (n-1) != 0.

For example, n =14 = 0b0000…1110, and (n - 1) = 13 = 0b0000…1101.

return n>0 && ((n & (n-1)) == 0);
    *
    *
    * */
}
