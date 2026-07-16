import java.util.*;
class SumofElements{
    public int sum(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] val={1,2,1,1,5,1};
        SumofElements obj=new SumofElements();
        System.out.println(obj.sum(val));
    }
}