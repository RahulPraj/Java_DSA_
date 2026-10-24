/**
 * Kadane's Algorithm
 *
 * This algorithm finds the maximum sum of a contiguous subarray.
 *
 * We keep adding elements to currentSum.
 * If currentSum becomes negative, we reset it to 0,
 * because a negative sum will reduce the sum of a future subarray.
 *
 * We update maxSum whenever currentSum becomes greater than maxSum.
 */
// time complexity is >O(n)


public class kadanesAlgorithem {

    public static void kadanes(int nums[]){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for(int i = 0 ; i<nums.length;i++){
            cs = cs +nums[i];
          
            ms = Math.max(cs, ms);
            if(cs < 0){
                cs = 0;
            }
        }
        System.out.println("maxSum:" + ms);
    }
    public static void main(String[] args) {
        int nums[] = {-2,-3,-1,-4,-1,-3,-5,-2};
        kadanes(nums);
    }
    
}