import java.util.*;
class MaxConsecutiveOnes_III{
    public int maxOnes(int[] nums, int k){
        int left=0;
        int count=0;
        int zeroes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }
            while(zeroes>k){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }

            count=Math.max(count,i-left+1);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,1,0,0,0,1,1,1,1,0};
        int n=sc.nextInt();
        MaxConsecutiveOnes_III obj=new MaxConsecutiveOnes_III();
        System.out.println(obj.maxOnes(arr,n));
    }
}