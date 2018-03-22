/**
 * @author Mert Ozer
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
 */
public class Two_Sum_II_Input_array_is_sorted_167 {

    public static void main(String[] args){
        int nums[] = {1,2,3,4,4,9,56};
        int[] result = twoSum(nums,8);
        for (int i:result)
            System.out.println(i);
    }
    public static int[] twoSum(int[] numbers, int target) {
        int [] array = new int[2];
        for (int i = 0; i < numbers.length -1; i++){
            int toSearch = target - numbers[i];
            int begin = i + 1;
            int end = numbers.length - 1;
            while (begin <= end){
                int middle = (begin + end)/2;
                if (numbers[middle] == toSearch){
                    array[0] = i + 1;
                    array[1] = middle + 1;
                    return array;
                }
                else if(numbers[middle] < toSearch){
                    begin = middle + 1;
                }
                else {
                    end = middle - 1;
                }
            }
        }
        return array;
    }
}
