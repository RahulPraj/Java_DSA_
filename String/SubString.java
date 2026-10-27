package String;
/**
 * Substring in Java
 *
 * 1. A substring is a continuous (consecutive) part of a string.
 *
 * 2. To extract a substring, we specify a starting index and an ending index.
 *
 * 3. In Java, we use the substring() method to get a substring.
 *
 * 4. Syntax:
 *    str.substring(startIndex, endIndex);
 *
 * 5. The starting index is included, but the ending index is excluded.
 *
 * Example:
 *    String str = "HelloWorld";
 *    str.substring(0, 5);
 *
 *    Output: "Hello"
 *
 * 6. A substring must contain continuous characters from the original string.
 *
 * 7. The original string remains unchanged because Strings in Java
 *    are immutable.
 */

public class SubString {

    public static String subStirng(String str,int st,int ed){
        String subStr = "";
        for(int i=st; i<ed; i++){
            subStr += str.charAt(i);
        }
        return subStr;
    }
  public static void main(String[] args) {
    String str = "HelloWorld";

    System.out.print(subStirng(str, 0, 4));
  }  
}
