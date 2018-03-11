/**
 * @author Mert Ozer
 * Given a binary array, find the maximum number of consecutive 1s in this array.


 */
public class Max_Consecutive_Ones_485 {
    public static void main(String[] args){
        int [] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for(Integer num:nums){

            if (num == 1)
                count++;
            else {
                if (count > max)
                    max = count;
                count = 0;

            }
        }
        return Math.max(count, max);
    }
}
