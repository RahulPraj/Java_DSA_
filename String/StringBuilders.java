package String;

/**
 * Difference Between String and StringBuilder
 *
 * 1. String is immutable, which means its value cannot be changed
 *    after the object is created.
 *
 * 2. StringBuilder is mutable, which means we can modify its contents
 *    without creating a new object for every modification.
 *
 * 3. When we modify a String, a new string value is created, and
 *    the original String object remains unchanged.
 *
 * 4. StringBuilder modifies the contents of the existing object.
 *
 * 5. String is suitable for text that does not require frequent changes.
 *
 * 6. StringBuilder is generally more efficient when performing
 *    repeated string modifications, especially inside loops.
 *
 * 7. Common String methods:
 *    - concat()
 *    - substring()
 *    - toUpperCase()
 *    - toLowerCase()
 *
 * 8. Common StringBuilder methods:
 *    - append()  : Adds text at the end.
 *    - insert()  : Inserts text at a specified index.
 *    - delete()  : Removes characters from a specified range.
 *    - reverse() : Reverses the characters.
 *
 * Example:
 *
 * String str = "Hello";
 * str = str + " World";
 * // Creates a new String value; the original String remains unchanged.
 *
 * StringBuilder sb = new StringBuilder("Hello");
 * sb.append(" World");
 * // Modifies the contents of the existing StringBuilder object.
 *
 */

public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a' ; ch <='z';ch++){
            sb.append(ch);
        }
        System.out.print(sb);
    }
}
