import javax.sound.sampled.SourceDataLine;

import org.jcp.xml.dsig.internal.SignerOutputStream;

public class pattern{

    public static void Hollow_Ractangle(int row, int col){
        for(int i = 1 ; i<=row ; i++){
            for(int j = 1 ; j<=col ; j++){
                if( i==1 || j==1 || i==row || j==col){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }

    public static void inverted_half_pyramid_star1(int n){
        for (int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j <=n ; j++){
                if(j > n-i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
    public static void inverted_half_pyramid_star(int n){
        for (int i = 1 ; i<= n ; i++){
            for(int j = 1 ; j <=n - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid_with_number(int row){
        for(int i = 0 ; i<row ; i++){
            for(int j = 1 ; j<=row-i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int row){
        int c = 1;
        for(int i = 1 ; i<=row ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int row){
        int c = 1;
        for(int i = 1 ; i<=row ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(c);
                c = (c==1) ? 0 : 1;
            }
            System.out.println();
        }
    }

    public static void butterfly(int row){
        for(int i = 1 ; i<=row/2 ; i++){ // `1st and 2nd square
            for(int j  = 1 ; j <=i ; j++){// for star in 1st square
                System.out.print("*");
            }
                for(int j =i ; j<=(row/2)-1 ; j++){ // for space in 1st square
                    System.out.print(" ");
                }
                    for(int j = row/2 ; j <=row-i; j++){// for space in 2nd square
                        System.out.print(" ");
                    }
                        for(int j = 1; j <= i ; j++){// for satr in 2nd square
                            System.out.print("*");
                        }
            System.out.println();
        }
        for(int i = row/2 ; i<=row ; i++){
            for(int j  = 1 ; j <=row - i ; j++){
                System.out.print("*");
            }
                for(int j = 1 ; j<= i -(row/2) ; j++){
                    System.out.print(" ");
                }
            for(int j = 1 ; j<= i -(row/2) ; j++){
                System.out.print(" ");
            }
                for(int j  = 1 ; j <=row - i ; j++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }
    public static void butterflycopy(int row){
        for(int i = 1 ; i<=row/2 ; i++){ // `1st and 2nd square
            for(int j  = 1 ; j <=i ; j++){// for star in 1st square
                System.out.print("*");
            }
                for(int j =i ; j<=(row/2)-1 ; j++){ // for space in 1st square
                    System.out.print(" ");
                }
                for(int j =i ; j<=(row/2)-1 ; j++){ // for space in 1st square
                    System.out.print(" ");
                }
            for(int j  = 1 ; j <=i ; j++){// for star in 1st square
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = row/2 ; i<=row ; i++){
            for(int j  = 1 ; j <=row - i ; j++){
                System.out.print("*");
            }
                for(int j = 1 ; j<= i -(row/2) ; j++){
                    System.out.print(" ");
                }
            for(int j = 1 ; j<= i -(row/2) ; j++){
                System.out.print(" ");
            }
                for(int j  = 1 ; j <=row - i ; j++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }

    public static void sold_rohombus(int row){
        for(int i = 1 ; i <= row; i++){
            for(int j = 1 ; j<= row - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=row ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rohombus(int row){
        for(int i = 1 ; i <= row; i++){
            for(int j = 1 ; j<= row - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j<=row ; j++){
                if(i==1 || j==1 || i==row || j==row ){
                System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void daimond(int row){
        int count =0;
        for(int i = 0 ; i < row ; i++){
            for(int j = i ; j < row-1 ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <=row ; j++){
                
               for(int k = 0 ; k < (2*j)-1 ; k++){
                System.out.print("*");
               }
                // count++;
                System.out.println();
            }
            // System.out.println();
        }
    }

    public static void main(String[] args) {
        // Hollow_Ractangle(4, 8);
        // inverted_half_pyramid_star1(4);
        // inverted_half_pyramid_star(4);
        // inverted_half_pyramid_with_number(5);
        // floyds_triangle(5);
        // zero_one_triangle(4);
        // butterfly(8);
        // butterflycopy(10);
        // sold_rohombus(5);
        // hollow_rohombus(8);
        daimond(4);

    }
}