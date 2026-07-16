import java.util.*;
class ReverseArray{
    public int[] reverse(int[] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] val={5,4,3,2,1};
        ReverseArray obj=new ReverseArray();
        System.out.println(Arrays.toString(obj.reverse(val)));
    }
}