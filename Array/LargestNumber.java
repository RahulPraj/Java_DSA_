public class LargestNumber {

    public  static  int largestValue(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("smallest number"+smallest);
        return  largest;

    }
    public static void main(String[] args) {
        int num[] = {2,4,6,8,10,15,1,5};
        System.out.print("the largest value:"+largestValue(num));

    }
}
