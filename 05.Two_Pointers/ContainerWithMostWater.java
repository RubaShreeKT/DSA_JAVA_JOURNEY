import java.util.*;
class ContainerWithMostWater{
    public int conatainerWithWater(int[] height){
        int left=0;
        int right=height.length-1;
        int water=0;
        while(left<right){
            int length=right-left;
            int minheight=Math.min(height[left],height[right]);
            int currentWater=minheight*length;
            water=Math.max(water,currentWater);
            if(height[left]>height[right]){
                right--;
            }else{
                left++;
            }
        }
        return water;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums={1,1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater obj=new ContainerWithMostWater();
        System.out.println(obj.conatainerWithWater(nums));
    }
}