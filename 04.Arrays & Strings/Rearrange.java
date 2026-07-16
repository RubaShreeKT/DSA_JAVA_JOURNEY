import java.util.*;
class Rearrange{
    public int[] rearrange(int[] arr){
        Arrays.sort(arr);
        int left=arr.length/2;
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
        int[] val={8, 7, 1, 6, 5, 9};
        Rearrange obj=new Rearrange();
        System.out.println(Arrays.toString(obj.rearrange(val)));
    }
}