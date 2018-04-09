/**
 * @author Mert Ozer
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.

Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 */
public class House_Robber_198 {

    public static void main(String[] args){
        //int[] nums = {4,2,1,8,10,3};
        int[] nums = {1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (i % 2 == 0)
                even = Math.max(even + nums[i], odd);
            else
                odd = Math.max(even, odd + nums[i]);

        }

        return Math.max(even, odd);
    }
}
