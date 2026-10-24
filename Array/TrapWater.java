/**
 * Trapping Rain Water Problem
 *
 * Goal:
 * Calculate the total amount of rainwater trapped between the bars.
 *
 * Step 1: The height of each bar is given in an array of integers.
 *         All bar heights must be non-negative (0 or greater).
 *         The width of every bar is 1 unit.
 *
 * Step 2: To trap water, we need a left boundary, a right boundary,
 *         and space between them. Therefore, at least 3 bars are
 *         required to trap water.
 *
 * Step 3: Create two auxiliary arrays:
 *         - leftMax[] stores the maximum height from the left up to
 *           the current index.
 *         - rightMax[] stores the maximum height from the right up to
 *           the current index.
 *
 * Step 4: Find the water level at each index by choosing the smaller
 *         of the maximum heights on the left and right.
 *
 *         waterLevel = min(leftMax[i], rightMax[i])
 *
 * Step 5: Calculate the water trapped above each bar.
 *
 *         trappedWater = waterLevel - height[i]
 *
 *         Since the width of each bar is 1:
 *
 *         trappedWater = min(leftMax[i], rightMax[i]) - height[i]
 *
 * Step 6: Add the trapped water at every index to calculate the
 *         total amount of trapped rainwater.
 *
 * Edge Cases:
 *
 * 1. Empty array:
 *    No bars are present, so the trapped water is 0.
 *
 * 2. One or two bars:
 *    Water cannot be trapped because there is no space between
 *    two boundaries. The trapped water is 0.
 *
 * 3. Negative bar height:
 *    Negative heights are invalid input because bar heights must
 *    be non-negative. Reject the input or report an error.
 *
 * 4. All bar heights are 0:
 *    No water is trapped.
 *
 * 5. Bars are continuously increasing or decreasing:
 *    No water is trapped because there is no suitable boundary
 *    on both sides of an inner bar.
 *
 * 6. All bars have the same height:
 *    No water is trapped.
 *
 * 7. Water level is equal to the current bar height:
 *    No water is trapped at that index.
 */

// time complexity = O(n)
public class TrapWater {

    public  static  int trappedRainWater(int height[]){
        int n = height.length;
        //calculate leftMax boundary;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i<n; i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);

        }

        // calculate rightMax boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0;i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // run loop
        int trappedWater = 0;
        for(int i = 0; i<n;i++){
            //calculate waterLevel
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trapped water
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5}; 
        System.out.println("trappedwater:"+trappedRainWater(height));
    }
    
}
