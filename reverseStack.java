import java.util.ArrayList;

public class reverseStack {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>();

        boolean isEmpty() {
            return list.size() == 0;
        }

        void push(int data) {
            list.add(data);
        }

        int pop() {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        int peek() {
            return list.get(list.size() - 1);
        }

        void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }

            int top = pop();
            pushAtBottom(data);
            push(top);
        }

        void reverse() {
            if (isEmpty()) {
                return;
            }
            int top = pop();
            reverse();
            pushAtBottom(top);
        }

        //Print the stack
        void printStack() {
            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        System.out.println("Original Stack:");
        s.printStack();

        s.reverse();

        System.out.println("\nReversed Stack:");
        s.printStack();
    }
}
