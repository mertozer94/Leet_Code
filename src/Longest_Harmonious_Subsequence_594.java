import java.util.HashMap;

/**
 * @author Mert Ozer
 * We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.

Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.

Example 1:
Input: [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].
Note: The length of the input array will not exceed 20,000.
 */
public class Longest_Harmonious_Subsequence_594 {
    public static void main(String[] args){
        int[] nums = {1,3,2,2,5,2,3,7};
        //int[] nums = {1,1,1,1};
        System.out.println(findLHS(nums));
    }
    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num: nums){
            if (map.containsKey(num)){
                int c = map.get(num);
                map.replace(num, c+1);
            }
            else {
                map.put(num, 1);
            }
        }
        int biggestChain = 0;
        for(int key:map.keySet()){
            int sum = 0;
            if (map.containsKey(key+1))
                sum += map.get(key+1);
            else continue;
            sum += map.get(key);
            if (sum > biggestChain)
                biggestChain = sum;
        }
        return biggestChain;
    }
}
