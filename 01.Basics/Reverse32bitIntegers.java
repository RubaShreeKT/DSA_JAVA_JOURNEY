import java.util.*;
class Reverse32bitIntegers{
    public int reverse(int x){
        long rev=0;
        int num=x;
        while(num!=0){
            int digit=num % 10;
            rev=rev * 10 + digit;
            num=num/10;
        }
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        return (int) rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Reverse32bitIntegers obj=new Reverse32bitIntegers();
        System.out.println(obj.reverse(n));
    }
}