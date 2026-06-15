import java.util.*;
class LongestOnesDeletingAElement{
    public int longestOnes(int[] nums){
        int left=0;
        int count=0;
        int zeroes=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeroes++;
            }
            while(zeroes>1){
                if(nums[left]==0){
                    zeroes--;
                }
                left++;
            }
            count=Math.max(count,i-left);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={0,1,1,1,0,1,1,0,1};
        LongestOnesDeletingAElement obj=new LongestOnesDeletingAElement();
        System.out.println(obj.longestOnes(arr));
    }
}