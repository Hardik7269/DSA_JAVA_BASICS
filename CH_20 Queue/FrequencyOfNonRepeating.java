import java.util.*;
public class FrequencyOfNonRepeating{
    public static void main(String[] args) {
        String str = "aabccxb";
        StringBuilder sb = new StringBuilder("");
        Queue<Character> queue = new LinkedList<>();
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            queue.add(curr);
            arr[curr - 'a']++; 
            while(!queue.isEmpty() && arr[queue.peek() - 'a'] > 1){
                queue.remove();
            }
            if(queue.isEmpty()){
                sb.append(-1);
            }else{
                sb.append(curr);
            }
        }

        System.out.println(sb);
    }
}