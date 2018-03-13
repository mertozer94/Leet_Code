/**
 * @author Mert Ozer
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
