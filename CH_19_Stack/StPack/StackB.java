package StPack;
import java.util.*;
public class StackB{
    public static class Stack{
        ArrayList<Integer> list = new ArrayList<>();

        boolean  isEmpty(){
            return list.size() == 0 ;
        }

        void push(int n){
            list.add(n);
        }

        int pop(){
            if(!list.isEmpty()){
                int temp = list.get(list.size()-1);
                list.remove(list.get(list.size()-1));
                return temp;
            }else{
                throw new EmptyStackException() ;
            }
        }

        int peep(){
            if(!list.isEmpty()){
                return list.get(list.size()-1);
            }else{
                System.out.print( "null");
                return -1;
            }
        }
    }
}