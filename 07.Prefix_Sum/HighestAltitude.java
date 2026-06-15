import java.util.*;
class HighestAltitude{
    public int highestAltitude(int[] gain){
        int altitude=0;
        int highestAltitude=0;
        for(int i=0;i<gain.length;i++){
            altitude+=gain[i];
            highestAltitude=Math.max(altitude,highestAltitude);
        }
        return highestAltitude;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] nums={-5,1,5,0,-7};
        HighestAltitude obj=new HighestAltitude();
        System.out.println(obj.highestAltitude(nums));
    }
}