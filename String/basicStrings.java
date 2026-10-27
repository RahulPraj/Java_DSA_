package String;

import java.util.Scanner;

public class basicStrings {

    public static void printLetters(String str){
        for(int i = 0; i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // storing single char at a one time in array
        char ch[] = {'a','b','c','d'};

        // String
        // USE String Class
        // store in double quotes
        // String is IMMUTABLE-> cant change after creation 
        // String str = "abcd";
        // String str1 = new String("abcd");

        // input strings
        Scanner sc = new Scanner(System.in);

        // it prints first word of the String before space
        // String name = sc.next(); 
        // System.out.print(name);

        // it print the words after space or print entire sentance.
        // String userName = sc.nextLine();
        // System.out.print(userName);

        // length() -> we can calculate length of ths String
        // it include space between the char or words.
        // String fullName = "Rahul Prajapati";
        // System.out.print(fullName.length());

        // Concatination -> merge two or more strings together
        // String firstName = "rahul";
        // String lastName = "praj";
        // String fullName = firstName + " " + lastName;
        // System.out.println(fullName);

        // charAt() ->it is used to find single character from a string with the help of index number.
        // System.out.println(firstName.charAt(1));

        // print all characters
        // printLetters(fullName);

        //.equals()-> whenever i have to compare two strings values
        // example
        String s1 = "Tony";
        String s2 = new String("Tony");

        if(s1.equals(s2)){
            System.out.print("Strings are equal");
        }else{
            System.out.print("strings are not equal");
        }
    }
}
