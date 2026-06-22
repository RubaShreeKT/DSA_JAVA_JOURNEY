import java.util.*;
class MajorityElement{
    public int majorityElement(int[] nums){
        int count=0;
        int element=0;
        for(int num:nums){
            if(count==0){
                element=num;
            }
            if(num==element){
                count++;
            }else{
                count--;
            }
        }
        return element;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,1,1,2,3,2,2,3};
        MajorityElement obj=new MajorityElement();
        System.out.println(obj.majorityElement(arr));
    }
}