public class Reacursion{

    public static int fib(int n){

        if (n == 0 || n == 1){
            return 1;
        }
        int fib = fib (n-1) + fib(n-2);
        return fib;
    }

    public static void main(String args[]){
        // PrintNum p = new PrintNum();
        // p.printNum(1,5);
        System.out.println(fib(5));
    }
}



class PrintNum{

    void printNum(int n, int ls){
        if(n==ls){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printNum(n+1, ls);
        System.out.print("*");
    }
}