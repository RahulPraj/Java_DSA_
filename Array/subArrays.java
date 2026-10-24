// brute force Time complexity - O(n3)

public class subArrays {

    public  static  void subarraylist(int nums[]){
        int ts = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<nums.length;i++){
            int start = i;
            for(int j= i; j<nums.length;j++){
                int end = j;
                for(int k = start; k<=end; k++){
                    System.out.print(nums[k]+" ");
                    sum += nums[k];
                }
                ts++;
                System.out.println("sum:"+sum);
                if(maxSum < sum){
                    maxSum = sum;
                }
                
                System.out.println();
                sum = 0;
            }
            System.out.println();
        }
        System.out.println(maxSum);
        System.out.println("total subArrays:"+ts);
        
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        subarraylist(nums);
    }
}
