import java.util.*;


class KthFactor{
    public static void main(String[] args) {
        int n = 1000;
        int k = 3;
        int limit =(int) Math.sqrt(n);
        if(k >= limit*2){
            System.out.println(-1);
            // return -1;
        }
        int count = 1;
        int index = 0;
        ArrayList<Integer>[] arr = new ArrayList[limit];
        ArrayList<Integer> list = new ArrayList<>();
        while(index < limit && index <= k){
            if(n % count == 0){
                list.add(count);
                list.add(n/count);
                arr[index] = list;
                index++;
                list = new ArrayList<>();
            }
            count++;
        }
        for (ArrayList<Integer> ele : arr) {
            System.out.println(ele);
        }

        if(k > arr.length*2){
            // return -1;
            System.out.println("-1");
        }

        try{
            if(k <= arr.length){
                // return arr[k-1].get(0);
                System.out.println(arr[k-1].get(0));
            }
            // return arr[(arr.length*2) - k].get(1);
            System.out.println(arr[(arr.length*2) - k].get(1));
        }catch(Exception e){
            // return arr[0].get(1);
            System.out.println(arr[0].get(1));
        }
    }
}