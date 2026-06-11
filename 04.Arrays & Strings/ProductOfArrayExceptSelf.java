import java.util.*;
class ProductOfArrayExceptSelf{
    public int[] productArray(int[] nums){
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for(int i=1;i<n;i++){
            ans[i]=nums[i-1]*ans[i-1];
        }
        int suffix=1;
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*suffix;
            suffix*=nums[i];
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] num={1,2,3,4};
        ProductOfArrayExceptSelf obj=new ProductOfArrayExceptSelf();
        int[] val=obj.productArray(num);
        System.out.println(Arrays.toString(val));
    }
}