import java.util.*;
public class NextGrater{
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        int arr[] = {6,8,0,1,3};
        st.push(arr[arr.length-1]);
        for(int i =  arr.length-2; i >= 0 ; i--){
            if(arr[i] > arr[i+1]){
                st.push(arr[i]);
            }else{
                st.push(arr[i+1]);
            }
        }

        System.out.println(st);
        int res[] = new int[arr.length];
        for(int i  = 0 ; i < arr.length ; i++){
            if(arr[i] < st.peek()){
                res[i] = st.pop();
            }else {
                res[i] = -1;
                st.pop();
            }
        }
        System.out.println(Arrays.toString(res));   
    }
}