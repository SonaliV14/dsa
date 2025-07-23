import java.util.*;

public class jobSequencingProblem {
    public static int jobScheduling(int[] deadline, int[] profit) {
        int n= deadline.length;
        int[][] jobInfo= new int[n][2];
        for(int i=0;i<n;i++){
            jobInfo[i][0]=deadline[i];
            jobInfo[i][1]= profit[i];
        }

        Arrays.sort(jobInfo, (a,b)-> b[1]-a[1]);

        int time=0, ans=0;
        for(int i=0;i<n;i++){
            if(jobInfo[i][0]>time){
                ans+=jobInfo[i][1];
                time++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] deadline={4,1,1,1};
        int[] profit={50,10,40,70};
        System.out.println(jobScheduling(deadline,profit));
    }
}
