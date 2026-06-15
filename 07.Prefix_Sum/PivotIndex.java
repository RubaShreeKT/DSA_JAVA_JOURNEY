import java.util.*;
class PivotIndex{
    public int pivotIndex(int[] nums){
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=totalSum-leftSum-nums[i];
            if(leftSum==rightSum){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,7,3,6,5,6};
        PivotIndex obj=new PivotIndex();
        System.out.println(obj.pivotIndex(arr));
    }
}