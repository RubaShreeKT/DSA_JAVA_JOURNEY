import java.util.*;
class ThirdMaximumNumber{
    public int thirdMaximum(int[] nums){
        long first=Long.MIN_VALUE;
        long second=Long.MIN_VALUE;
        long third=Long.MIN_VALUE;
        for(int num:nums){
            if(first==num || second==num || third==num){
                continue;
            }
            if(num>first){
                third=second;
                second=first;
                first=num;
            }else if(num>second){
                third=second;
                second=num;
            }else if(num>third){
                third=num;
            }
        }
        return third==Long.MIN_VALUE?(int)first:(int)third;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2};
        ThirdMaximumNumber obj=new ThirdMaximumNumber();
        System.out.println(obj.thirdMaximum(arr));
    }
}