import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author Mert Ozer
 *
 * Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

 */
public class Intersection_of_Two_Arrays_II_350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length == 0 || nums2.length == 0)
            return new int[0];

        ArrayList<Integer> arr = new ArrayList();
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for(int num: nums1){
            if(map1.containsKey(num))
                map1.put(num, map1.get(num)+1);
            else
                map1.put(num, 1);
        }
        for(int num: nums2){
            if(map2.containsKey(num))
                map2.put(num, map2.get(num)+1);
            else
                map2.put(num, 1);
        }


        for(int val: map1.keySet()){
            if(map2.containsKey(val)){
                for(int j = 0; j < Math.min(map1.get(val), map2.get(val)); j++){
                    arr.add(val);
                }
            }
        }
        int i = 0;
        int[] nums = new int [arr.size()];
        for(int el:arr){
            nums[i] = el;
            i++;
        }

        return nums;
    }
}
