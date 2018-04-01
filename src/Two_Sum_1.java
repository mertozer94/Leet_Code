import java.util.HashMap;

/**
 * @author Mert Ozer
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 */
public class Two_Sum_1 {
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
    }
    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++){
         if (map.containsKey(target - numbers[i])){
             result[0] = map.get(target - numbers[i]);
             result[1] = i ;
             return result;
         }

         map.put(numbers[i], i);
        }

        return result;
    }
}