package String;

/**
 * Convert the First Letter of Each Word to Uppercase
 *
 * 1. We are given a string, and our goal is to convert the first
 *    letter of every word to uppercase.
 *
 * 2. We use StringBuilder to build the resulting string efficiently.
 *
 * 3. Traverse the string character by character.
 *
 * 4. Whenever we find the first character of a word, convert it
 *    to uppercase and append it to the StringBuilder.
 *
 * 5. When we encounter a space, the next character will be the
 *    beginning of a new word.
 *
 * 6. Continue until all characters have been processed.
 *
 * 7. Use toString() to convert the StringBuilder into a String.
 *
 * Example:
 *    Input:  "hi, i am shradha"
 *    Output: "Hi, I Am Shradha"
 */
// time complexity - O(n)

public class ToUpperCaseString {
    public static String convertToUpperCases(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length();i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hii, i am rahul";
        System.out.print(convertToUpperCases(str));
    }
}
