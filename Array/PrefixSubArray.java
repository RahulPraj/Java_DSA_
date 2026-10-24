/**
 * PrefixSubArray
 */

// Better approach to find the maximum subarray sum using Prefix Sum.

// Prefix sum stores the cumulative sum of array elements
// from index 0 up to the current index.
// It helps calculate the sum of any subarray efficiently.
//in this we create new array in that array we keep the total sum.

//first we calculate prefix array = prefix[i-1] + arr[i]
// to calculate sum = prefix[end] - prefix[start-1]
public class PrefixSubArray {

    public  static  void prefixSubArray(int nums[]){
        
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[nums.length];
        prefixArr[0] = nums[0];
        for(int i = 1; i < prefixArr.length;i++){
            prefixArr[i] = prefixArr[i-1] + nums[i];
        } 

        for(int i = 0; i<nums.length;i++){
            int start = i;
            for(int j= i; j<nums.length;j++){
                int end = j;
                
            sum =start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start-1];
                
                if(maxSum < sum){
                    maxSum = sum;
                }
                
            }

        }
        System.out.println("maximum sum:"+maxSum);

        
    }
    public static void main(String[] args) {
        int nums[] = {2,4,6,8,10};
        prefixSubArray(nums);
    }
    
}