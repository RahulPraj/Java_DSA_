/**
 * Spiral Matrix
 *
 * 1. Humein 2D matrix ke saare elements ko spiral order mein print karna hai.
 *    Matlab pehle outer boundary, phir uske andar wali boundary.
 *
 * 2. Hum 4 variables use karenge:
 *    - startRow = Sabse pehli row
 *    - endRow   = Sabse aakhri row
 *    - startCol = Sabse pehla column
 *    - endCol   = Sabse aakhri column
 *
 * 3. Matrix ko 4 directions mein traverse karenge:
 *
 *    TOP:
 *    Pehli row ko left se right traverse karo.
 *    Phir startRow++ kar do, kyunki top row complete ho gayi.
 *
 *    RIGHT:
 *    Last column ko top se bottom traverse karo.
 *    Phir endCol-- kar do, kyunki right column complete ho gaya.
 *
 *    BOTTOM:
 *    Last row ko right se left traverse karo.
 *    Phir endRow-- kar do, kyunki bottom row complete ho gayi.
 *
 *    LEFT:
 *    First column ko bottom se top traverse karo.
 *    Phir startCol++ kar do, kyunki left column complete ho gaya.
 *
 * 4. Har direction complete hone ke baad boundary ko update karte hain,
 *    taaki already visited elements dobara traverse na hon.
 *
 * 5. Bottom aur Left direction traverse karne se pehle check karna zaroori
 *    hai ki rows aur columns ki boundaries cross toh nahi ho gayi.
 *
 * 6. Ye 4 steps repeat karte rahenge jab tak saare elements visit na ho jaayein.
 *
 * 7. Jab startRow > endRow ya startCol > endCol ho jaaye,
 *    toh traversal stop kar denge.
 *
 * Example:
 *    1   2   3   4
 *    5   6   7   8
 *    9  10  11  12
 *   13  14  15  16
 *
 * Spiral Order:
 *    1, 2, 3, 4, 8, 12, 16, 15, 14, 13,
 *    9, 5, 6, 7, 11, 10
 *
 * Time Complexity: O(rows * columns)
 * Extra Space Complexity: O(1), agar sirf traversal kar rahe hain
 *                         aur output store nahi kar rahe.
 */

public class SpiralMatrix {

    public static void spiralMatrixPrint(int matrix[][]){
        int SR = 0;
        int SC = 0;
        int ER = matrix.length-1;
        int EC = matrix[0].length-1;

        while (SR <= ER && SC <= EC) {
            
            //TOP
            for(int j =SC; j <= EC;j++){
                System.out.print(matrix[SR][j]+" ");
            }

            // RIGHT
            for(int i = SR+1; i<=ER;i++){
                System.out.print(matrix[i][EC]+" ");
            }

            //BOTTOM
            for(int j = EC-1; j>= SC;j--){
                if(SR ==ER){
                    break;
                }
                System.out.print(matrix[ER][j]+" ");
            }

            //left
            for(int i = ER-1; i>=SR+1;i--){
                if(SC ==EC){
                    break;
                }
                System.out.print(matrix[i][SC]+" ");
            }
            SR++;
            SC++;
            ER--;
            EC--;
            
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

        spiralMatrixPrint(matrix);
    }
}
