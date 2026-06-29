import java.util.*;
class DecodeString{
    public String decodeString(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=']'){
                stack.push(s.charAt(i));
            }else{
                StringBuilder temp=new StringBuilder();
                while(!stack.isEmpty() && stack.peek()!='['){
                    temp.append(stack.pop());
                }
                temp.reverse();
                stack.pop();

                StringBuilder num=new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.peek())){
                    num.insert(0,stack.pop());
                }

                int number=Integer.parseInt(num.toString());
                StringBuilder repeat=new StringBuilder();
                for(int j=0; j<number; j++){
                    repeat.append(temp);
                }

                for(char ch:repeat.toString().toCharArray()){
                    stack.push(ch);
                }
            }
        }
        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        result.reverse();
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        DecodeString obj=new DecodeString();
        System.out.println(obj.decodeString(s));
    }
}