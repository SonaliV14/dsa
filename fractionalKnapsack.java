import java.util.*;

public class fractionalKnapsack {
    public static int maxValue(int[] weights, int[] value, int W){
        double[][] ratio = new double[weights.length][2];
        for(int i=0;i<weights.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=value[i]/(double)weights[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));

        int capacity=W;
        int ans=0;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weights[idx]){
                ans+=value[idx];
                capacity-=weights[idx];
            }else{
                ans+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] weight={10,20,30};
        int[] values={60,100,120};
        System.out.println(maxValue(weight, values, 50));
    }
}
