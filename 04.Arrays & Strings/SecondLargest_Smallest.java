import java.util.*;
class SecondLargest_Smallest{
    public static void secondLargestSmallest(int[] arr){
        if(arr.length<=1){
            System.out.println("-1");
            return;
        }
        int firstLargest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>firstLargest){
                secondLargest=firstLargest;
                firstLargest=num;
            }else if(num>secondLargest && num!=firstLargest){
                secondLargest=num;
            }
        }
        int firstSmallest=Integer.MAX_VALUE;
        int secondSmallest=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<firstSmallest){
                secondSmallest=firstSmallest;
                firstSmallest=num;
            }else if(num<secondSmallest && num!=firstSmallest){
                secondSmallest=num;
            }
        }
        System.out.println(secondSmallest);
        System.out.println(secondLargest);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] val={1, 2, 4, 7, 7, 5};
        secondLargestSmallest(val);
    }
}