package StPack;
import java.util.*;
public class StackPushBott  {
    static Stack<Integer> s = new Stack<>();
    public void PushBott(Stack<Integer> s , int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        PushBott(s, data);
        s.push(top);
    }
}
