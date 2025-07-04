import java.util.ArrayList;
import java.util.List;

public class implementStack{
    public class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pull(){
            int top = list.get(list.size()-1);
            list.remove(top);

            return top;
        }

        public static int peek(){
            return list.get(list.size()-1);
        }
    }
}