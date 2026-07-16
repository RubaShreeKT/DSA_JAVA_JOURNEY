import java.util.*;
class LeftRightRotate{
    static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public int[] leftRotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
        return arr;
    }
    public int[] rightRotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        leftRotate(arr,n-k);
        return arr;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] val={1,2,3,4,5};
        int k=2;
        LeftRightRotate obj=new LeftRightRotate();
        System.out.println(Arrays.toString(obj.leftRotate(val,k)));
        val=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(obj.rightRotate(val,k)));
    } 
}