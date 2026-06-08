import java.util.*;
class Add_Two_Integers{
    public int add(int num1,int num2){
        return num1+num2;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        Add_Two_Integers obj=new Add_Two_Integers();
        System.out.println(obj.add(n1,n2));        
    }
}