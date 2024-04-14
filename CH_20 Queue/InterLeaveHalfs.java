import java.util.LinkedList;
import java.util.Queue;

class InterLeaveHalfs{
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        Queue<Integer> queLast = new LinkedList<>();
        int n = 1;
        while(n < 11){
            que.add(n);
            n++;
        }
        // if (true) {
        //     reverseQueue(que);
        //     System.out.print(que);
        //     return;
        // }
        n = que.size()/2;
        for(int i = 0 ; i < n ; i++){
            queLast.add(que.remove());
        }
        while(!queLast.isEmpty()){
            que.add(queLast.remove());
            que.add(que.remove());
        }
        System.out.println(que);
    }
    
    public static void reverseQueue(Queue<Integer> que){
        if(que.isEmpty()){
            return;
        }
        var curr = que.poll();
        reverseQueue(que);
        que.add(curr);
    }


}