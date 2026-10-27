package String;

/**
 * Shortest Path Problem
 *
 * 1. We are given a route containing four directions: East (E),
 *    West (W), North (N), and South (S).
 *
 * 2. We start from the origin (0, 0).
 *
 * 3. We use two variables, x and y, to track our current position.
 *    Initially, x = 0 and y = 0.
 *
 * 4. Update the coordinates according to each direction:
 *
 *    - North (N): y = y + 1
 *    - South (S): y = y - 1
 *    - East  (E): x = x + 1
 *    - West  (W): x = x - 1
 *
 * 5. Traverse the route string character by character and update
 *    the x and y coordinates.
 *
 * 6. After processing the entire route, x and y represent the
 *    final destination coordinates.
 *
 * 7. To find the shortest path, calculate the straight-line
 *    distance between the starting point (0, 0) and the destination.
 *
 *    Formula:
 *    distance = sqrt((x - 0)^2 + (y - 0)^2)
 *
 *    Simplified formula:
 *    distance = sqrt(x * x + y * y)
 *
 * 8. The shortest path is the direct distance from the starting
 *    point to the destination, not the total distance travelled
 *    along the route.
 *
 * Example:
 *    Final coordinates: (3, 4)
 *    Shortest distance = sqrt(3 * 3 + 4 * 4)
 *                      = sqrt(9 + 16)
 *                      = sqrt(25)
 *                      = 5
 *
 * Time Complexity: O(n), where n is the length of the route.
 * Space Complexity: O(1), because we use only x and y variables.
 */

public class ShortestPath {

    public static float getPath(String str){
        int x = 0;
        int y = 0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            
            // North
            if(dir == 'N'){
                y++;
            }
            // SOUTH
            else if(dir=='S'){
                y--;
            }
            //east
            else if(dir=='E'){
                x++;
            }
            // west
            else{
                x--;
            }
        }
        int x2 = x*x;
        int y2 = y*y;

        return (float) Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println("shorted path:"+getPath(str));
    }
}
