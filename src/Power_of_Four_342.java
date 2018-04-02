/**
 * @author Mert Ozer
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

Example:
Given num = 16, return true. Given num = 5, return false.

Follow up: Could you solve it without loops/recursion?
 */
public class Power_of_Four_342 {
    public static void main(String[] args){
        int[] nums = {0,1,2,4,5,8,16,256,64,65};
        for(int num:nums)
            System.out.println(isPowerOfFour(num));
    }
    public static boolean isPowerOfFour(int num) {
        return num > 0 && (num&(num-1)) == 0 && (num & 0x55555555) != 0;
        //0x55555555 is to get rid of those power of 2 but not power of 4
        //so that the single 1 bit always appears at the odd position
    }
}
