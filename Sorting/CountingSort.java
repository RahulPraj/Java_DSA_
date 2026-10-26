/**
 * Counting Sort
 *
 * 1. Counting Sort is a sorting algorithm that sorts elements by
 *    counting how many times each value appears in the array.
 *
 * 2. First, find the maximum value in the array to determine the
 *    size of the count array.
 *
 * 3. Create a count array to store the frequency of each value.
 *    The index represents the number, and the value at that index
 *    represents how many times the number occurs.
 *
 * 4. Traverse the original array and increase the frequency
 *    of each number in the count array.
 *
 * 5. Traverse the count array from the smallest index to the
 *    largest index.
 *
 * 6. Add each number to the original array as many times as its
 *    frequency in the count array.
 *
 * 7. After this process, the original array will be sorted
 *    in ascending order.
 *
 * Example:
 *    Original array: [1, 4, 1, 3, 2, 4, 3, 7]
 *
 *    Frequency:
 *    1 appears 2 times
 *    2 appears 1 time
 *    3 appears 2 times
 *    4 appears 2 times
 *    7 appears 1 time
 *
 *    Sorted array: [1, 1, 2, 3, 3, 4, 4, 7]
 *
 * Time Complexity: O(n + range)
 * Space Complexity: O(range)
 *
 * Note: This basic approach assumes non-negative integers.
 * Counting Sort is efficient when the range of values is not too large.
 */

package Sorting;

public class CountingSort {
    public static void sorting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        // find the count of numbers
        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length;i++){
            count[arr[i]]++;
        }

        int j = 0;
        for(int i = 0; i<count.length;i++){
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
         public  static void print(int arr[]){
        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3,4,3,7};
        sorting(arr);
        print(arr);
    }
}
