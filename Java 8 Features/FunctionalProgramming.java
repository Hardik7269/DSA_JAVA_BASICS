import java.util.*;
import java.util.Optional;

public class FunctionalProgramming{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,8,9,10);
        List<String> course = List.of("Spring" , "Spring boot" , "Hel" , "h");
        //simple for loop
        // list.forEach(System.out::println);

        //add filter in it  -- method passing in stream (static method so use class name for call method)
        // list.stream().filter(FunctionalProgramming::isEven).forEach(System.out::println); 
        // list.stream().filter(num -> num%2 != 0).forEach(System.out::println);
            //here we used lambda exression : a smaller version of a method --> One line function

        //Optional (when there is a chance of the value can be null)

        Predicate<? super String> predicate = c -> c.charAt(0) == 'S';
        Optional<String> optional = course.stream().filter(predicate).findFirst();
        optional.ifPresent(System.out::println);
        System.out.println(optional.isPresent());
        System.out.println(optional.orElse("No matching element found"));


            // --> Excercise
            //print all course starts with s
            // course.stream().filter(str -> str.charAt(0) == 'S').forEach(System.out::println);

            // print all the cube of the numbers
            // list.stream().filter(num -> num %2 != 0)
            //     .map(e -> Math.pow(e,3))
            //     .forEach(System.out::println);

            //print out number of character in each course
            // course.stream().map(e -> e.length()).forEach(System.out::println);

    }

    public static boolean isEven(int n){
        return n%2 == 0;
    }

    //trying to print all the numbers 
}