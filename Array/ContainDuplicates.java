//check if any values comes twice return true or else return false

public class ContainDuplicates {
    public static boolean containDuplicateNum(int nums[]){
        for(int i=0; i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4}; 
        System.out.println(containDuplicateNum(nums));
    }
    
}
