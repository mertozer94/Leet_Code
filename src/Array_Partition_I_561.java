import java.util.Arrays;

/**
 * @author Mert Ozer
 *
 * Given an array of 2n integers, your task is to group these integers into n
 * pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn)
 * which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 */
public class Array_Partition_I_561 {
    public static void main(String[] args){
        int[] nums = {5,2,3,4};
        System.out.println(arrayPairSum(nums));

    }
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if (i % 2 == 0)
                sum += nums[i];
        }
        return sum;
    }
}
