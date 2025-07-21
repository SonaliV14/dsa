public class activitySelection{
    public static int countMaxActivities(int start[], int end[]){
        int count=1;
        int currActivity=0;
        int n=start.length;
        for(int i=1;i<n;i++){
            if(start[i]>=end[currActivity]){
                count++;
                currActivity=i;
                System.out.println("Activity no. "+i+" added");
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        //end time basis sort

        System.out.println(countMaxActivities(start,end));
    }
}