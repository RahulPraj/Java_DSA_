// find the index of an element in an array
// time complexity -> O(n)

public class LinearSearch {

    public static int linerSearchArray(int number[],int key){
        for(int i = 0; i<number.length;i++){
            if(number[i] == key){
                return  i;
            }
        }
        return  -1;
    }
   public static void main(String[] args) {
    int number[] = {2,4,6,8,10,12,14,16,18,20};
    int key = 50;

    int index = linerSearchArray(number, key);
    if(index == -1){
        System.out.println("index not found");
    }
    else{
        System.out.println("number found on index:"+ index);
    }
   } 
}
