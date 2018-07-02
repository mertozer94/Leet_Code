import java.util.ArrayList;
import java.util.List;

/**
 * @author Mert Ozer
 *
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements that appear twice in this array.

Could you do it without extra space and in O(n) runtime?

Example:
Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]
 */
public class Find_All_Duplicates_in_an_Array_442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            if(num < 0)
                num = -num;
            if(nums[num-1] > 0)
                nums[num-1] = -nums[num-1];
            else
                list.add(num);
        }
        //for(int num: nums)
        //    if(num > 0)
        //        list.add(num);

        return list;

    }
}
