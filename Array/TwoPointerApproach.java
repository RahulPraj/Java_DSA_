/**
 * Two-Pointer Approach
 *
 * 1. The Two-Pointer Approach uses two index variables to traverse
 *    an array efficiently.
 *
 * 2. We usually use two variables named `left` and `right` to point
 *    to different positions in the array.
 *
 * 3. In a sorted array, `left` starts at index 0 and `right` starts
 *    at the last index.
 *
 * 4. We perform an operation using the values at both pointers,
 *    such as calculating their sum.
 *
 * 5. We move the pointers based on the result and the problem's
 *    conditions.
 *
 * 6. We continue until the pointers meet or cross, or until the
 *    required condition is satisfied.
 *
 * 7. For finding pairs with a target sum, the array should be sorted
 *    so we can decide which pointer to move.
 *
 * 8. This approach can reduce time complexity compared to checking
 *    every pair using nested loops.
 */

// example -Given a sorted array, find two numbers whose sum equals the target.


public class TwoPointerApproach {

    public static void twoSum(int nums[],int target){
        int left = 0;
        int right = nums.length-1;
        // int sum = 0;
        while (left < right) {
           int sum = nums[left] + nums[right];
            if(sum == target){
               System.out.println(
                    nums[left] + " + " + nums[right] + " = " + target
                );
               return ; 
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        
    }
    public static void main(String[] args) {
        int nums[]= {1, 2, 4, 6, 8, 9};
        int target = 12;
        twoSum(nums, target);
    }
    
}
