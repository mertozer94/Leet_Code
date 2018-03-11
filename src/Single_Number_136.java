/**
 * @author Mert Ozer
 * Given an array of integers, every element appears twice except for one. Find that single one.

Note:
Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Single_Number_136 {
    public static void main(String[] args){
        int [] nums = {1,1,2,2,3,4,4};
        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {
        for (int i = 1; i < nums.length; ++i)
            nums[0] ^= nums[i];
        return nums[0];
    }
}
