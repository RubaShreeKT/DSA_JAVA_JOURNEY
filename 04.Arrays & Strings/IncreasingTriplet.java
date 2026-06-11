import java.util.*;
class IncreasingTriplet{
    public boolean increasingTriplet(int[] nums){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=first){
                first=nums[i];
            }else if(nums[i]<=second){
                second=nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num={1,2,3,4,5};
        IncreasingTriplet obj=new IncreasingTriplet();
        boolean val=obj.increasingTriplet(num);
        System.out.println(val);
    }
}