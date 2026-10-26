package Sorting;
/**
 * Inbuilt Sorting in Java
 *
 * 1. Java provides the Arrays.sort() method to sort arrays easily.
 *
 * 2. Arrays.sort(arr) sorts primitive int[] arrays in ascending order.
 *
 * 3. To sort an array in descending order, we can use
 *    Collections.reverseOrder().
 *
 * 4. Collections.reverseOrder() works with object types like Integer[],
 *    not primitive types like int[].
 *
 * 5. int is a primitive data type, whereas Integer is a wrapper class
 *    that represents an integer as an object.
 *
 * 6. Ascending order:
 *    Arrays.sort(arr);
 *
 * 7. Descending order:
 *    Arrays.sort(arr, Collections.reverseOrder());
 *    // Here, arr must be an Integer[] array.
 *
 * 8. To sort a specific range:
 *    Arrays.sort(arr, si, ei);
 *    // si is the starting index (inclusive).
 *    // ei is the ending index (exclusive).
 *
 * 9. To sort a specific range in descending order:
 *    Arrays.sort(arr, si, ei, Collections.reverseOrder());
 *    // Here, arr must be an Integer[] array.
 *
 * 10. For descending order with int[], sort in ascending order first
 *     and then reverse the array manually.
 */


import java.util.*;
public class InbuildSort {
     public  static void print(Integer arr[]){
        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        // in ascending order
        // int arr[] = {4,5,3,1,2};
        // Arrays.sort(arr);
        // print(arr);
        // System.out.print(arr);

        // reverse order
        Integer arr[] = {5,3,1,2,4};
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
        
    }
}
