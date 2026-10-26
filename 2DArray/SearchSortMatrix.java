/**
 * Search in a Sorted Matrix - Staircase Search
 *
 * 1. We are given a 2D matrix in which:
 *    - Every row is sorted in ascending order.
 *    - Every column is sorted in ascending order.
 *
 * 2. Our goal is to find a given key in the matrix.
 *
 * 3. Brute Force Approach:
 *    - Check every element one by one.
 *    - Time Complexity: O(rows * columns).
 *
 * 4. Staircase Search Approach:
 *    - Start from the top-right corner OR the bottom-left corner.
 *    - Compare the current cell value with the key.
 *
 * 5. If we start from the TOP-RIGHT corner:
 *
 *    - If key == cell value:
 *      The key is found.
 *
 *    - If key < cell value:
 *      Move LEFT because all values below the current cell
 *      are greater than or equal to its value.
 *
 *    - If key > cell value:
 *      Move DOWN because all values to the left of the current
 *      cell are smaller than its value.
 *
 * 6. Repeat the process until the key is found or we move
 *    outside the matrix boundaries.
 *
 * 7. If the key is not found, return false or -1, depending
 *    on what the problem requires.
 *
 * Time Complexity: O(rows + columns)
 * Space Complexity: O(1)
 */

public class SearchSortMatrix {
    public static boolean StairCaseSearchTopRight(int matrix[][],int key){
        int row = 0; int col = matrix.length-1;
        while (row <= matrix.length && col >= 0) {
            if(matrix[row][col]==key){
                System.out.print("matrix:"+"("+row+","+col+")");
                return true;
            }else if(key< matrix[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("key not found");
        return false;
    }

     public static boolean StairCaseSearchBottomLeft(int matrix[][],int key){
        int row = matrix.length-1; int col =0;
        while (col <= matrix.length && row >= 0) {
            if(matrix[row][col]==key){
                System.out.print("matrix:"+"("+row+","+col+")");
                return true;
            }else if(key< matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.print("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
        int key = 39;
    StairCaseSearchTopRight(matrix,key);
    StairCaseSearchBottomLeft(matrix,key);
    }
    
}
