import java.util.*;
public class duplicateParenthesis {
    public static boolean isDuplicate(String str){
        Stack<Character> stack= new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);

            //closing brackets
            if(ch==')'){
                int count=0;
                while( stack.peek() != '('){
                    stack.pop();
                    count++;
                }
                if(count<1){
                    return true; //duplicate
                }else{
                    stack.pop(); //opening pair
                }
            }
            //opening bracket/operands/operations
            else{
                stack.push(ch);
            }
        }
        return false;
    }
}
