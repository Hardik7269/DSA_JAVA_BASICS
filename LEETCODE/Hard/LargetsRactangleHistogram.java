import java.util.*;

public class LargetsRactangleHistogram{
public static void main(String[] args) {
    int arr[] = {2,1,5,6,2,3};
    //creating the stack for storing index of small element then curr
    int[] arrLeft = findLeft(arr);    

    int[] arrRight = findRight(arr);

    System.out.println(Arrays.toString(arrLeft));
    System.out.println(Arrays.toString(arrRight));

    

    int max = 0;

    for (int i = 0; i < arr.length; i++) {
        int area = findArea(arr, arrLeft, arrRight, i);
        max = Math.max(max, area);
    }
    System.out.println(max);
}


    public static int findArea(int [] arr , int[] arrLeft , int[] arrRight , int index){

        int width = (arrRight[index] - arrLeft[index]) - 1;
        
        return arr[index] * width;
    }

    public static int[] findLeft(int[] arr) {
        int[] left = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
    
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            left[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
    
        return left;
    }
    
    public static int[] findRight(int[] arr) {
        int[] right = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
    
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            right[i] = stack.isEmpty() ? arr.length : stack.peek();
            stack.push(i);
        }
    
        return right;
    }
    
}