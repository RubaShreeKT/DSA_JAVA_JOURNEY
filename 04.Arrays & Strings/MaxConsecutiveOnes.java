import java.util.*;
class MaxConsecutiveOnes{
    public int maxOnes(int[] nums){
        int count=0;
        int maxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxCount=Math.max(count,maxCount);
            }else{
                count=0;
            }
        }
        return maxCount;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,0,0,1,1,1};
        MaxConsecutiveOnes obj=new MaxConsecutiveOnes();
        System.out.println(obj.maxOnes(arr));
    }
}