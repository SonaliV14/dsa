import java.util.*;
public class validParenthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            //if any opening bracket is there
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch); 
            }
            //closing bracket
            else{
                if(stack.isEmpty()){
                    return false;
                }else{
                    if(stack.peek()=='(' && ch==')' || stack.peek()=='{' && ch=='}' || stack.peek()=='[' && ch==']'){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        String str="((){})";
        if(isValid(str)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
    }
}
