import java.util.Scanner;

public class basicArray {

    public static void main(String[] args) {
        // syntax of array
        // int arr[] = new int[50];

        // Scanner sc = new Scanner(System.in);
        // arr[0] =sc.nextInt() ;
        // arr[1]=sc.nextInt();
        // arr[2]=sc.nextInt();

        // System.out.println("index[0]"+ arr[0]);
        // System.out.println("index[1]"+ arr[1]);
        // System.out.println("index[2]"+ arr[2]);

        // // print length of array
        // System.out.println("length of array"+ arr.length);

        // array passed as call by reference means if we do change in array in other function 
        // it reflect the change in orignal function.

        int marks[] = {79,99,89};
        updateMarks(marks);

        for(int i = 0; i<marks.length; i++){
            System.out.print(marks[i]+" ");
        }

    }

    public static void updateMarks(int marks[]){
        for(int i=0; i <marks.length;i++){
            marks[i] = marks[i] + 1;
        }
    }
}