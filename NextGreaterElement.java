import java.util.Stack;

public class NextGreaterElement {
     public static int[] nextGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] nextGreater = new int[arr.length];
        int nextGreaterElement=0;
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nextGreaterElement = -1;
            }else{
                nextGreaterElement = stack.peek();
            }
            stack.push(i);
        }
        return nextGreater;
    }
    public static void main(String[] args) {
        int[] arr={6,8,0,1,3};
        int[] nxtGreater= nextGreaterElement(arr);
        for(int e:nxtGreater){
            System.out.print(e+" ");
        }
    }

}
