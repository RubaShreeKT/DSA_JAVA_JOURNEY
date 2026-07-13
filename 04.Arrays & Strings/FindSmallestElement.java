import java.util.*;
class FindSmallestElement{
    public int findElement(int[] arr){
        int smallest=arr[0];
        for(int num:arr){
            if(num<smallest){
                smallest=num;
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] val={8, 10, 5, 7, 9};
        FindSmallestElement obj=new FindSmallestElement();
        System.out.println(obj.findElement(val));
    }
}