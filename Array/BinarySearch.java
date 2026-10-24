// Binary search applies on sorted array
// time complexity -> O(log n)


public class BinarySearch {

    public  static  int binarySearchArray(int num[],int key){
        int start = 0;
        int end = num.length-1;
        while (start <= end) {
            int mid = (start + end)/2;
            if(num[mid] == key){
                return  mid;
            }
            if(num[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return  -1;
    }

    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        System.out.println("index of a value:"+binarySearchArray(nums, key));
    }
}
