/**
 * Selection Sort
 *
 * 1. Selection Sort is a sorting algorithm that arranges array elements
 *    in ascending or descending order.
 *
 * 2. In each pass, find the smallest element from the unsorted part
 *    of the array.
 *
 * 3. Initially, assume the first element of the unsorted part is
 *    the minimum element.
 *
 * 4. Compare it with the remaining elements and update the minimum
 *    index whenever a smaller element is found.
 *
 * 5. After finding the smallest element, swap it with the first
 *    element of the unsorted part.
 *
 * 6. After each pass, the sorted part of the array grows by one element.
 *
 * 7. Repeat the process until the entire array is sorted.
 *
 * Example:
 *    Before: [5, 3, 8, 1, 2]
 *    After:  [1, 2, 3, 5, 8]
 *
 * Time Complexity: O(n^2) in best, average, and worst cases.
 * Space Complexity: O(1), because sorting is performed in the same array.
 */

package Sorting;

public class SelectionSort {

    public static void sorting(int arr[]){
        for(int turn = 0; turn<arr.length-1;turn++){
            int minPos = turn;
            for(int j = turn+1; j<arr.length;j++){
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            // swap
            int temp = arr[minPos];
            arr[minPos]=arr[turn];
            arr[turn]=temp;
        }
    }
    public  static void print(int arr[]){
        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

   public static void main(String[] args) {
    int arr[] = {5,4,1,3,2};
    sorting(arr);
    print(arr);
   } 
}
