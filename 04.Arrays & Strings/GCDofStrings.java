import java.util.*;
class GCDofStrings{
    public String gcdOfStrings(String s1,String s2){
        if(!(s1+s2).equals(s2+s1)){
            return "";
        }
        int len=gcd(s1.length(),s2.length());
            return s1.substring(0,len);
    }
    private static int gcd(int a ,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    String str2=sc.next();
    GCDofStrings obj=new GCDofStrings();
    System.out.println(obj.gcdOfStrings(str1,str2));
}
}