import java.util.ArrayList;
public class Subset{
    public static void findSubset(int []arr,ArrayList<Integer> list, int idx){
        //base case
        if(idx == arr.length){
            System.out.print(list + ", ");
            return;
        }

        //if accepted
        int curr = arr[idx];
        list.add(curr);
        findSubset(arr, list, idx+1);
        //if rejected
        findSubset(arr, list, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        ArrayList<Integer> list = new ArrayList<>();
        findSubset(arr, list, 0);
    }
}