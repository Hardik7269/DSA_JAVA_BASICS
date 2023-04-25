import java.util.ArrayList;
import java.util.*;
class TwoDimentional{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(9);
        list.add(4);
        list.add(6);
        list.add(1);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(7);
        list1.add(2);
        list1.add(56);
        list1.add(9);

        list2.add(17);
        list2.add(12);
        list2.add(56);
        list2.add(93);

        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
        list3.add(list1);
        list3.add(list2);
        System.out.println(list3);
        
        for(int i = 0 ; i < list3.size() ; i++){
            ArrayList<Integer> currentList = list3.get(i);
            for(int j = 0 ; j < currentList.size() ; j++){
                System.out.print(currentList.get(j) + " " );
            }
            System.out.println();
        }

    }
}