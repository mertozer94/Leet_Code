/**
 * @author Mert Ozer
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

Example 1

Input: [3,0,1]
Output: 2
Example 2

Input: [9,6,4,2,3,5,7,0,1]
Output: 8

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 */
public class Missing_Number_268 {
    public static void main(String[] args){
        //int[] nums = {0,1,2,4};
        int[] nums = {3,1,2,4};
        //int[] nums = {0};
        //int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        int max = 0;
        int sum = 0;
        for (Integer num: nums){
            if (num > max)
                max = num;
            sum += num;
        }
        int requiredSum = (max*(max+1))/2;
        if (requiredSum == sum){
            if (max < nums.length)
                return max+1;
            else
                return 0;
        }
        return requiredSum - sum;
    }

    /* Good solution from the disscussion
    *
    * int xor = 0, i = 0;
	  for (i = 0; i < nums.length; i++) {
	 	xor = xor ^ i ^ nums[i];
	  }

	  return xor ^ i;
    *
    *
    * */
}
