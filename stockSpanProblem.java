import java.util.*;

public class stockSpanProblem {
    public static void stockSpan(int[] stocks, int[] span){
         Stack<Integer> stack = new Stack<>();
         span[0]=1;
         stack.push(0);

         for(int i=1;i<stocks.length;i++){
            int currPrice = stocks[i];
            while(!stack.isEmpty() && currPrice> stocks[stack.peek()]){
                stack.pop();
            }

            if(stack.isEmpty()){
                span[i]=i+1;
            }else{
                int prevHigh = stack.peek();
                span[i]=i=prevHigh;
            }
            stack.push(i);
         }
    }
}
