import java.util.*;
class RemoveElement{
    public int removeElement(int[] nums, int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,3,2};
        int n=3;
        RemoveElement obj=new RemoveElement();
        System.out.println(obj.removeElement(arr,n));
    }
}