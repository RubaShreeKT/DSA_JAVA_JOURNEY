import java.util.*;
class CanPlaceFlowers{
    public boolean canPlaceFlowers(int[] plot, int flowers){
        for(int i=0;i<plot.length;i++){
            if(plot[i]==0){
                boolean leftPlot=(i==0)||(plot[i-1]==0);
                boolean rightPlot=(i==plot.length-1)||(plot[i+1]==0);
        
        if(leftPlot && rightPlot){
            plot[i]=1;
            flowers--;
        }
        if(flowers<=0){
            return true;
        }     
    }   
        
    }
    return flowers<=0;
}

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] p={1,0,0,0,1};
        int f=1;
        CanPlaceFlowers obj=new CanPlaceFlowers();
        boolean val=obj.canPlaceFlowers(p,f);
        System.out.println(val);
    }
}