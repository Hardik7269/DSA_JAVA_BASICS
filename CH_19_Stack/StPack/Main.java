package StPack;
import java.util.Stack;
public class Main {
    public static void main(String [] args){
        // StackB.Stack s = new StackB.Stack();
        StackPushBott s = new StackPushBott();
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        s.PushBott(st, 0);
        while(!st.isEmpty()){
            System.out.print(st.pop()+"->");
        }
    }
}
