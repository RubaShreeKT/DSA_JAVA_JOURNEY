import java.util.*;
class StringCompression{
    public int stringCompression(char[] ch){
        int read=0;
        int write=0;
        while(read < ch.length){
            char currentch=ch[read];
            int count=0;
            while(read < ch.length && ch[read]==currentch){
                read++;
                count++;
            }
        ch[write++]=currentch;
        if(count>1){
            String str=Integer.toString(count);
        
        for(int i=0;i<str.length();i++){
            ch[write++]=str.charAt(i);
        }
    }
    }
    return write;
}
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StringCompression obj=new StringCompression();
        char[] chars={'a','a','a','b','b','b','b'};
        int val=obj.stringCompression(chars);
        System.out.println(val); 
    }
}