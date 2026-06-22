import java.util.*;
class RemoveDuplicatesII{
    public int removeDuplicates(int[] nums){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(i<2 || nums[i]>nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,1,2,2,2,3,4,4,4};
        RemoveDuplicatesII obj=new RemoveDuplicatesII();
        System.out.println(obj.removeDuplicates(arr));
    }
}