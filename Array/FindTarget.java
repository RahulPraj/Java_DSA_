/**
 * Search in Rotated Sorted Array
 *
 * 1. We are given an array sorted in ascending order with distinct values.
 *
 * 2. The array may be rotated at an unknown index.
 *
 * 3. After rotation, the array is divided into two sorted parts.
 *
 *    Example: [4, 5, 6, 7, 0, 1, 2]
 *
 * 4. We are also given a target value that we need to find in the array.
 *
 * 5. If the target is present, return its index; otherwise, return -1.
 *
 * 6. We must solve this problem using Binary Search with O(log n)
 *    time complexity.
 *
 * 7. At each step, identify which half of the array is sorted
 *    and determine which half may contain the target.
 *
 * 8. Eliminate the half that cannot contain the target and
 *    continue searching in the remaining half.
 * 
 *
target is in the sorted left half end = mid - 1

Target is not in the sorted left half start = mid + 1

Target is in the sorted right half start = mid + 1

Target is not in the sorted right half end = mid - 1
 */


public class FindTarget {

    public  static  int findTargetSorted(int nums[],int target){
        int start = 0;
        int end = nums.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            //check left half is sorted
            if(nums[start] <= nums[mid]){

                // check target is in sorted left half
                if(nums[start]<=target && target < nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                // check if right half is sorted find target
                if(target > nums[mid] && target <= nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            
        }
        return  -1;
    }
    public static void main(String[] args) {
        int nums[]={4,5,6,7,0,1,2};
        int target = 0;
        System.out.println("target index:"+ findTargetSorted(nums, target));
    }
    
}
