public class indianCoins {
    public static int countCoins(int[] notes, int value){
        int count=0;
        
        for(int i=notes.length-1;i>=0;i--){
            while(value>=notes[i]){
                value-=notes[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] notes={1,2,5,10,20,50,100,500,1000};
        System.out.println(countCoins(notes, 121));
    }
}
