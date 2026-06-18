import java.util.*;
class AsteroidCollision{
    public int[] asteroidCollision(int[] asteroids){
        Deque<Integer> stack=new ArrayDeque<>();
        for(int num:asteroids){
            boolean destroyed=false;
            while(!stack.isEmpty() && num<0 && stack.peek()>0){
                if(stack.peek()<-num){
                    stack.pop();
                }else if(stack.peek()==-num){
                    stack.pop();
                    destroyed=true;
                    break;
                }else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                stack.push(num);
            }
        }
        int[] asteroid=new int[stack.size()];
        for(int i=asteroid.length-1;i>=0;i--){
            asteroid[i]=stack.pop();
        }
        return asteroid;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={5,10,-5};
        AsteroidCollision obj=new AsteroidCollision();
        System.out.println(Arrays.toString(obj.asteroidCollision(arr)));
    }
} 