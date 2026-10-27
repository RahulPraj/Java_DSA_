package String;
/**
 * Find the Largest String
 *
 * 1. We are given an array of strings, and our goal is to find
 *    the lexicographically largest string.
 *
 * 2. Lexicographical order means dictionary-like order.
 *
 * 3. We initialize the first string as the largest string.
 *
 * 4. We compare the current largest string with each remaining
 *    string using the compareTo() method.
 *
 * 5. compareTo() returns:
 *    - 0  : Both strings are equal.
 *    - < 0: The first string comes before the second string.
 *    - > 0: The first string comes after the second string.
 *
 * 6. If compareTo() returns a negative value, update the largest
 *    string with the current string.
 *
 * 7. Continue until all strings have been compared.
 *
 * 8. Case sensitivity:
 *    - compareTo() is case-sensitive.
 *      For example, "Apple" and "apple" are not equal.
 *    - compareToIgnoreCase() compares strings without considering
 *      differences in letter case.
 *
 * Example:
 *    Strings: {"apple", "mango", "banana"}
 *    Largest string: "mango"
 *
 * Time Complexity: O(n * m), where n is the number of strings
 * and m is the maximum string length.
 */

public class LargestString {
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana","tomato"};
        String largest = fruits[0];
        for(int i=1; i<fruits.length;i++){
            if(largest.compareToIgnoreCase(fruits[i]) < 0){
                largest = fruits[i];
            }
        }
        System.out.print(largest);
    }
}
