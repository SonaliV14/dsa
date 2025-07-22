import java.util.Arrays;
public class minAbsoluteDiffpairs {
    public static int minDifference(int[] arr1, int[] arr2){
        int ans=0;
        int n= arr1.length;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<n;i++){
            ans+=Math.abs(arr1[i]-arr2[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1={4,1,8,7};
        int[] arr2={2,3,6,5};
        System.out.println(minDifference(arr1, arr2));
    }
}
