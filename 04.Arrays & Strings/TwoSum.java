import java.io.*;
import java.util.*;
class TwoSum{
    public int[] twoSum(int[] nums,int target){
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
        public static void main(String[] args){
            int[] n={5,3,2,7,4,6};
            int t=8;
            TwoSum obj=new TwoSum();
            int[] result=obj.twoSum(n,t);
            System.out.println(Arrays.toString(result));
        }

}