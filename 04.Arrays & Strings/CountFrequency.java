import java.util.*;
class CountFrequency{
    public void countfreq(int[] arr){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] n={10,5,10,15,10,5};
        CountFrequency obj=new CountFrequency();
        obj.countfreq(n);
    }
}