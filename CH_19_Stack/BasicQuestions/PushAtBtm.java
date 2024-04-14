import java.util.Stack;

class PushAtBtm{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        st.push(0);
        System.out.println(st);
        reacurssivelyPush(st , 5);
        System.out.println("After push : " + st);
    }

    public static void reacurssivelyPush(Stack<Integer> st , int target){
        if(st.isEmpty()){
            st.push(target);
            return;
        }
        int temp = st.pop();
        reacurssivelyPush(st, target);
        st.push(temp);
    }
}