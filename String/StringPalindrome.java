package String;

/**
 * Check Whether a String Is a Palindrome
 *
 * 1. A palindrome is a string that reads the same forward and backward.
 *    Example: "madam", "level", "121".
 *
 * 2. We compare characters from the beginning and the end of the string.
 *
 * 3. Use a loop to traverse only half of the string.
 *
 * 4. Compare the character at index i with the character at index
 *    (length - 1 - i).
 *
 * 5. If both characters are different, the string is not a palindrome,
 *    so return false.
 *
 * 6. If all corresponding characters match, the string is a palindrome,
 *    so return true.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class StringPalindrome {
    public static boolean isPalindrome(String str){
        int n = str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.print(isPalindrome(str));
    }
}
