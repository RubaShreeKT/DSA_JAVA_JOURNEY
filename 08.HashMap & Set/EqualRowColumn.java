import java.util.*;
class EqualRowColumn{
    public int equalRowColumn(int[][] grid){
        int n=grid.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            String rows=Arrays.toString(grid[i]);
            map.put(rows,map.getOrDefault(rows,0)+1);
        }
        int count=0;
        for(int col=0;col<n;col++){
            int[] columns=new int[n];
            for(int row=0;row<n;row++){
                columns[row]=grid[row][col];
            }
            String column=Arrays.toString(columns);
            count+=map.getOrDefault(column,0);
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] arr={{3,2,1},{1,7,6},{2,7,7}};
        EqualRowColumn obj=new EqualRowColumn();
        System.out.println(obj.equalRowColumn(arr));
    }
}