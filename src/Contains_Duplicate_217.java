import java.util.HashMap;

/**
 * @author Mert Ozer
 *
 * Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true

 */
public class Contains_Duplicate_217 {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums){

            if(map.containsKey(i))
                return true;

            else
                map.put(i, i);
        }
        return false;
    }
}
