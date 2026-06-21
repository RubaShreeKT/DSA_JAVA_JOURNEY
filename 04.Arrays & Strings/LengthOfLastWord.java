import java.util.*;
class LengthOfLastWord{
    public int lastWordLength(String s){
        int length=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                length++;
            }else{
                if(length>0){
                    break;
                }
            }
        }
        return length;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        LengthOfLastWord obj=new LengthOfLastWord();
        System.out.println(obj.lastWordLength(str));
    }
}