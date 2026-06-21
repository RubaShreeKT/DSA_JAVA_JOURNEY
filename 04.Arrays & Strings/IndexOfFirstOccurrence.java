import java.util.*;
class IndexOfFirstOccurrence{
    public int indexOfString(String haystack,String needle){
        for(int i=0,j=needle.length();j<=haystack.length();i++,j++){
            if(haystack.substring(i,j).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        IndexOfFirstOccurrence obj=new IndexOfFirstOccurrence();
        System.out.println(obj.indexOfString(str1,str2));
    }
}