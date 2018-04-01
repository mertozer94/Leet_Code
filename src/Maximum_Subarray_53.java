/**
 * @author Mert Ozer
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */
public class Maximum_Subarray_53 {
    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        /**
         *
         *
         this problem was discussed by Jon Bentley (Sep. 1984 Vol. 27 No. 9 Communications of the ACM P885)

         the paragraph below was copied from his paper (with a little modifications)

         algorithm that operates on arrays: it starts at the left end (element A[1]) and scans through to the right end (element A[n]), keeping track of the maximum sum subvector seen so far. The maximum is initially A[0]. Suppose we’ve solved the problem for A[1 … i - 1]; how can we extend that to A[1 … i]? The maximum
         sum in the first I elements is either the maximum sum in the first i - 1 elements (which we’ll call MaxSoFar), or it is that of a subvector that ends in position i (which we’ll call MaxEndingHere).

         MaxEndingHere is either A[i] plus the previous MaxEndingHere, or just A[i], whichever is larger.

         public static int maxSubArray(int[] A) {
         int maxSoFar=A[0], maxEndingHere=A[0];
         for (int i=1;i<A.length;++i){
         maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
         maxSoFar=Math.max(maxSoFar, maxEndingHere);
         }
         return maxSoFar;
         }
         */
        int maxSoFar=nums[0], maxEndingHere=nums[0];
        for (int i=1;i<nums.length;++i){
            maxEndingHere= Math.max(maxEndingHere+nums[i],nums[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;

    }
}
