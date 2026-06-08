import java.util.*;
class FizzBuzz{
    public List<String> fizzBuzz(int n){
        List<String> result=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                result.add("Fizz Buzz");
            }else if(i%3==0){
                result.add("Fizz");
            }else if(i%5==0){
                result.add("Buzz");
            }else{
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        FizzBuzz f=new FizzBuzz();
        System.out.println(f.fizzBuzz(val));
    }
}