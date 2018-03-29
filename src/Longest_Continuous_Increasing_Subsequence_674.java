/**
 * @author Mert Ozer
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Example 1:
Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
Example 2:
Input: [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2], its length is 1.
Note: Length of the array will not exceed 10,000.
 */
public class Longest_Continuous_Increasing_Subsequence_674 {
    public static void main(String[] args){
        int[] nums = {2,2,2,2,2,2,2};
        //int[] nums = {1,3,5,4,7};
        //int[] nums = {9,3,5,4,7,8};
        System.out.println(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int count = 0;
        int previous = -9999;
        int currentMax = 0;
        for (int num: nums) {
            if (num > previous){
                currentMax ++;
            }
            else {
                count = Math.max(currentMax, count);
                currentMax = 1;
            }
            previous = num;

        }
        return Math.max(currentMax, count);
    }
}
