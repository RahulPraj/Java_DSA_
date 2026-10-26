/**
 * Bubble Sort
 *
 * 1. Bubble Sort is a sorting algorithm that arranges array elements
 *    in ascending or descending order.
 *
 * 2. Compare two adjacent elements in the array.
 *
 * 3. If the left element is greater than the right element,
 *    swap their positions.
 *
 * 4. Continue comparing adjacent elements until the end of the array.
 *
 * 5. After each pass, the largest unsorted element moves to the
 *    end of the array.
 *
 * 6. Repeat the process until the array is sorted.
 *
 * 7. If no swaps occur during a pass, the array is already sorted,
 *    so we can stop early.
 *
 * Time Complexity:
 * Best Case: O(n) when using the optimized version.
 * Average and Worst Case: O(n^2).
 *
 * Space Complexity: O(1), because sorting is done in the same array.
 */



package Sorting;

public class BubbleSort {

    // worst approach-> O(n2)
    public static void sorting(int arr[]){
        for(int turn = 0; turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                // swap
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // best approach -> O(n)
    public  static void optimiseSorting(int arr[]){
        
        for(int turn = 0; turn<arr.length-1;turn++){
            boolean swap = false;
            for(int j=0;j<arr.length-1-turn;j++){
                // swap
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            // if it sorted and swap is false;
            if(!swap){
                break;
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
    int arr[] = {1,2,3,4,5};
    // sorting(arr);
    optimiseSorting(arr);
    print(arr);
  }  
}
