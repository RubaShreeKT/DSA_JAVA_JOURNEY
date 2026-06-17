import java.util.*;
class PalindromeNumber{
    public boolean palindrome(int x){
        if(x<0){
            return false;
        }
        int rev=0;
        int num=x;
        while(num!=0){
            int digit =num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        return rev==x;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PalindromeNumber obj=new PalindromeNumber();
        System.out.println(obj.palindrome(n));
    }
}