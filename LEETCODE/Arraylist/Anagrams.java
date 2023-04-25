import java.util.ArrayList;

class Anagrams{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        int a[] = {1,2,3,4};

        for(int i = 0 ; i < 4 ; i++){
            list1.add(a[i]);
            list.add(list1);
            System.out.println("for "+i+" sublist"+list1);
            System.out.println("for "+i+" list"+list);
        }
        System.out.println(list1);
        System.out.println("Arraylist ");
        for(int i = 0 ; i < list.size() ; i++){
            System.out.print(list.get(i)+", ");
        }
    }
}