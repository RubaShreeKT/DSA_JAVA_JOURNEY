import java.io.*;
import java.util.*;
public class Read_Inputs{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n1=sc.nextInt();
    String str=sc.next();
    sc.nextLine();
    boolean val=sc.nextBoolean();
    System.out.println("Number is:"+n1);
    System.out.println("String is:"+str);
    System.out.println("Boolean is:"+val);
    sc.close();
}
}