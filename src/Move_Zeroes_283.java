/**
 * @author Mert Ozer
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class Move_Zeroes_283 {
    public static void main(String[] args){
        int[] nums = {0,1,0,2,0,5};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++){

            if (nums[i] == 0){
                for (int j = i+1; j < nums.length; j++){

                    if (nums[j] != 0){
                        int swap = nums[j];
                        nums[j] = nums[i];
                        nums[i] = swap;
                        break;
                    }
                }
            }
        }
    }
}
