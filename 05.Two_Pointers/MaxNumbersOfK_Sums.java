import java.util.*;
class MaxNumbersOfK_Sums{
    public int maxOperations(int[] nums, int k){
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int count=0;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                count++;
                left++;
                right--;
            }else if(sum<k){
                left++;
            }else{
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num={1,2,3,4};
        int n=sc.nextInt();
        MaxNumbersOfK_Sums obj=new MaxNumbersOfK_Sums();
        System.out.println(obj.maxOperations(num,n));
    }
}