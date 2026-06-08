import java.util.*;
class MergeStrings{
    public String mergeStrings(String word1, String word2){
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                sb.append(word1.charAt(i));
            }
            if(i<word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        MergeStrings obj=new MergeStrings();
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(obj.mergeStrings(s1,s2));
    }
}