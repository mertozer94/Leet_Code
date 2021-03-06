/**
 * @author Mert Ozer
 * Given an array with n integers, your task is to check if it could become non-decreasing by modifying at most 1 element.

We define an array is non-decreasing if array[i] <= array[i + 1] holds for every i (1 <= i < n).

Example 1:
Input: [4,2,3]
Output: True
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
Example 2:
Input: [4,2,1]
Output: False
Explanation: You can't get a non-decreasing array by modify at most one element.
 */
public class Non_decreasing_Array_665 {
    public static void main(String[] args){
        int[] nums = {4,2,3,6};
        int[] nums1 = {4,2,1,6};
        int[] nums2 = {2,2,1,1};
        int[] nums3 = {15,4,16,15};
        int[] nums4 = {4,4,4,4,4};
        System.out.println(checkPossibility(nums));
        System.out.println(checkPossibility(nums1));
        System.out.println(checkPossibility(nums2));
        System.out.println(checkPossibility(nums3));
        System.out.println(checkPossibility(nums4));
    }
    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for(int i = 1; i < nums.length ; i++){
            if(nums[i] < nums[i-1]){
                count++;
                if (count > 1)
                    return false;
                if(i-2 < 0 || nums[i-2] <= nums[i])
                    nums[i-1] = nums[i];
                else
                    nums[i] = nums[i-1];
            }
        }
        return true;
    }
}
