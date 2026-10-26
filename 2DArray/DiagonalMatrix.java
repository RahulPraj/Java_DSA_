// package 2DArray;
/**
 * Sum of Both Diagonals in a Matrix
 *
 * 1. This problem works on a square matrix (N x N), where the number
 *    of rows and columns is equal.
 *
 * 2. There are two diagonals:
 *
 *    Primary Diagonal (PD):
 *    - Starts from the top-left (LT) and ends at the bottom-right (BR).
 *    - The row index and column index are equal: i == j.
 *
 *    Secondary Diagonal (SD):
 *    - Starts from the top-right (RT) and ends at the bottom-left (BL).
 *    - The sum of the row and column indices is N - 1: i + j == N - 1.
 *    - We can calculate the column index using j = N - 1 - i.
 *
 * 3. Our goal is to calculate the sum of both diagonals.
 *
 * 4. We can use a single loop to traverse both diagonals:
 *    - Add matrix[i][i] for the primary diagonal.
 *    - Add matrix[i][N - 1 - i] for the secondary diagonal.
 *
 * 5. Special Case: The Middle Element
 *    - In an odd-sized matrix, both diagonals overlap at the center.
 *    - For example, in a 3 x 3 matrix, matrix[1][1] belongs to both
 *      diagonals.
 *    - To avoid counting the middle element twice, add the secondary
 *      diagonal element only when i != N - 1 - i.
 *
 * 6. After traversing all rows, the sum variable contains the total
 *    sum of both diagonals without double-counting the center element.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class DiagonalMatrix {
    public  static int diagonalSum(int matrix[][]){
        // brute force -> O(n2)
        int sum = 0;
        // for(int i = 0; i <matrix.length;i++){
        //     for(int j = 0; j<matrix[0].length;j++){
        //         // primary diagonal condtion
        //         if(i==j){
        //             sum += matrix[i][j];
        //         }else if(i+j==matrix.length-1){
        //             sum += matrix[i][j];
        //         }
        //     }
        // }

        // optimize approach-> O(n)
        for(int i=0;i<matrix.length;i++){
            // primary condition
            sum += matrix[i][i];
            if(i != matrix.length-1-i){
                sum +=matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        System.out.print("diagonalsum:"+diagonalSum(matrix));
    }
}
