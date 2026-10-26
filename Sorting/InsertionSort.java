/**
 * Insertion Sort
 *
 * 1. Insertion Sort arranges array elements in ascending or descending order.
 *
 * 2. We divide the array into two parts:
 *    - Sorted part
 *    - Unsorted part
 *
 * 3. Initially, the first element is considered the sorted part.
 *
 * 4. Pick an element from the unsorted part. This element is called the key.
 *
 * 5. Compare the key with the elements in the sorted part, moving from
 *    right to left.
 *
 * 6. If an element is greater than the key, shift it one position
 *    to the right.
 *
 * 7. Insert the key into its correct position in the sorted part.
 *
 * 8. Repeat the process until all elements are sorted.
 *
 * Example:
 *    Before: [5, 3, 4, 1, 2]
 *    After:  [1, 2, 3, 4, 5]
 *
 * Time Complexity:
 *    Best Case: O(n) when the array is already sorted.
 *    Average Case: O(n^2).
 *    Worst Case: O(n^2) when the array is reverse sorted.
 *
 * Space Complexity: O(1), because sorting is done in the same array.
 */


package Sorting;

public class InsertionSort {
    public static void sorting(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev+1] = curr;

        }
    }
 public  static void print(int arr[]){
        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
   
   public static void main(String[] args) {
    int arr[]  = {5,4,1,3,2};
    sorting(arr);
    print(arr);
   } 
}
