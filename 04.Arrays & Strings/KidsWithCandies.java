import java.util.*;
class KidswithCandies{
    public List<Boolean> kidswithcandies(int[] candies,int extracandies){
        int max=candies[0];
        for(int candy:candies){
            if(candy>max){
                max=candy;
            }
        }
        List<Boolean> result=new ArrayList<>();
        for(int candy:candies){
            result.add(candy+extracandies>=max);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] c={3,1,4,5,6};
        int extc=sc.nextInt();
        KidswithCandies obj=new KidswithCandies();
        System.out.println(obj.kidswithcandies(c,extc));

    }
}