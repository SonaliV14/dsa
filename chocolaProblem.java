import java.util.*;
public class chocolaProblem {
    public static void main(String[] args) {
        Integer vertCost[]={2,1,3,1,4};
        Integer horzCost[]={4,1,2};

        int m= vertCost.length;
        int n= horzCost.length;

        Arrays.sort(vertCost, Collections.reverseOrder());
        Arrays.sort(horzCost, Collections.reverseOrder());

        int h=0,v=0;
        int hp=1, vp=1;
        int ans=0;
        while(h<n && v<m){
            if(vertCost[v]>=horzCost[h]){ //vertical cut
                ans+=(vertCost[v]*hp);
                vp++;
                v++;
            }else{ //horizontal cut
                ans+=(horzCost[h]*vp);
                hp++;
                h++;
            }
        }

        while(h<n){
            ans+=(horzCost[h]*vp);
            h++;
            vp++;
        }

        while(v<m){
            ans+=(vertCost[v]*hp);
            v++;
            hp++;
        }

        System.out.println("minimum cost is; "+ans);
    }
}
