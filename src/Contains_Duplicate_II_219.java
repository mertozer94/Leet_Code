import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Mert Ozer
 *
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false


 */
public class Contains_Duplicate_II_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                ArrayList<Integer> arr = map.get(nums[i]);
                for(int num: arr){
                    if(Math.abs(num-i) <= k)
                        return true;
                }
                arr.add(i);
            }
            else{
                ArrayList<Integer> arr = new ArrayList();
                arr.add(i);
                map.put(nums[i], arr);
            }

        }
        return false;
    }
}
