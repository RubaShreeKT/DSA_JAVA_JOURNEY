import java.util.*;
class ReverseVowels{
    public String reverseVowels(String s){
        char[] arr=s.toCharArray();
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(left<right && !isVowel(arr[left])){
                left++;
            }
            while(right>left && !isVowel(arr[right])){
                right--;
            }
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
            }
                    return new String(arr);

        }
        private static boolean isVowel(char ch){
                ch=Character.toLowerCase(ch);
                return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';}
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ReverseVowels obj=new ReverseVowels();
        System.out.println(obj.reverseVowels(str));
    }
}