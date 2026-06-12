import java.util.*;
class MoveZeroes{
    public int[] moveZeroes(int[] nums){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] n={1,0,3,0,12};
        MoveZeroes obj=new MoveZeroes();
        int[] val=obj.moveZeroes(n);
        System.out.println(Arrays.toString(val));
    }
}