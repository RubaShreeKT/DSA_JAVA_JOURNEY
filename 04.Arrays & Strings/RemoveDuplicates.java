import java.util.*;
class RemoveDuplicates{
    public int removeDuplicates(int[] nums){
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,2,3,4,4};
        RemoveDuplicates obj=new RemoveDuplicates();
        System.out.println(obj.removeDuplicates(arr));
    }
}