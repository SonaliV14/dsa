import java.util.ArrayList;

public class ReverseStringUsingStack {

    // Custom Stack class for characters
    static class MyStack {
        ArrayList<Character> list = new ArrayList<>();

        boolean isEmpty() {
            return list.isEmpty();
        }

        void push(char data) {
            list.add(data);
        }

        char pop() {
            if (!isEmpty()) {
                char top = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return top;
            }
            throw new RuntimeException("Stack underflow");
        }
    }

    // Method to reverse string using MyStack
    public static String reverseString(String str) {
        MyStack stack = new MyStack();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }

    // Main method
    public static void main(String[] args) {
        String s = "abc";
        String reversed = reverseString(s);
        System.out.println("Reversed String: " + reversed); // Output: cba
    }
}
