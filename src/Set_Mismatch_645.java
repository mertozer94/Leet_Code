import java.util.HashMap;

/**
 * @author Mert Ozer
 * The set S originally contains numbers from 1 to n. But unfortunately, due to the data error, one of the numbers in the set got duplicated to another number in the set, which results in repetition of one number and loss of another number.

Given an array nums representing the data status of this set after the error. Your task is to firstly find the number occurs twice and then find the number that is missing. Return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]
 */
public class Set_Mismatch_645 {
    public static void main(String[] args){
        int[] nums = {1,1,2,4};
        int[] test = findErrorNums(nums);
        System.out.println(test[0]);
        System.out.println(test[1]);
    }
    public static int[] findErrorNums(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int repetead = 0;
        int[] result = new int[2];

        for (int num:nums){

            sum += num;
            if(map.containsKey(num))
                repetead = num;
            else
                map.put(num, 1);
        }
        int shouldBe = ((nums.length+1)*nums.length)/2;

        result[0] = repetead;
        result[1] = repetead - sum + shouldBe;
        return result;
    }
}
