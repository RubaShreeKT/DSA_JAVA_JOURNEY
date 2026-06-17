import java.util.*;
class PalindromeString{
    public boolean palindrome(String str){
        str=str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        PalindromeString obj=new PalindromeString();
        System.out.println(obj.palindrome(s));
    }
}