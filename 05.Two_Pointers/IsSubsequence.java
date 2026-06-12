import java.util.*;
class IsSubsequence{
    public boolean isSubsequence(String s, String t){
        int sp=0;
        int tp=0;
        while(sp<s.length() && tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
            }
            tp++;
        }
        return sp==s.length();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        IsSubsequence obj=new IsSubsequence();
        System.out.println(obj.isSubsequence(s1,s2));
    }
}