import java.util.ArrayList;
public class ArrayStack{
    static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();
        static boolean isEmpty(){
            return list.size()==0;
        }

        static void push(int data){
            list.add(data);
        }

        static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}