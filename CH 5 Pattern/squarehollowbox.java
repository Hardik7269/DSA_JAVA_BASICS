// import java.util.Scanner;

public class squarehollowbox{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        int n = 4;
        for(int i = 1 ; i<=n ; i++){
                if(i == 1 || i == 4){
                    for(int j = 1 ; j<=5 ; j++){
                        System.out.print("*");
                    }
                }else{
                    for(int j = 1 ; j<=5 ; j++){
                        if(j == 2 || j == 3 || j == 4){
                            System.out.print(" ");
                        }else{
                            System.out.print("*");
                        }
                    }
                }
            System.out.println();
        }
    }
}

