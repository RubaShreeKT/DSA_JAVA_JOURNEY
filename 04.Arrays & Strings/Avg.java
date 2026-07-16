import java.util.*;
class Avg{
    public float avg(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        float avg=sum/arr.length;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] val={1,2,1,1,5,1};
        Avg obj=new Avg();
        System.out.println(obj.avg(val));
    }
}