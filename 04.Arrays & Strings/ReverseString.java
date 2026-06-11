import java.util.*;
class ReverseString{
    public String reverseString(String s){
        String[] arr=s.trim().split("\\s+");
        StringBuilder result=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            result.append(arr[i]);
            result.append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ReverseString obj=new ReverseString();
        System.out.println(obj.reverseString(str));
    }
}