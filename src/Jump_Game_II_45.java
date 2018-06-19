/**
 * @author Mert Ozer
 *
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Example:

Input: [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
Jump 1 step from index 0 to 1, then 3 steps to the last index.
Note:

You can assume that you can always reach the last index.
 */
public class Jump_Game_II_45 {
    public static void main(String[] args){
        int[] test = {2,3,1,1,4};
        int[] test1 = {2,3,0,1,4};
        int[] test2 = {0};
        int[] test3 = {1};
        System.out.println(jump(test));
        System.out.println(jump(test1));
        System.out.println(jump(test2));
        System.out.println(jump(test3));
    }
    public static int jump(int[] nums) {

        if (nums[0] == 0)
            return 0;
        return jump(nums, 0);
    }
    public static int jump(int[] nums, int i) {

         if (i + nums[i] >= nums.length -1)
            return 1;

        else {
            int min = 999999;
            for (int j = 1 ; j <= nums[i]; j++){
                int local = 1 + jump(nums, i + j);
                if (local < min)
                    min = local;
            }
            return min;
        }

    }
}
