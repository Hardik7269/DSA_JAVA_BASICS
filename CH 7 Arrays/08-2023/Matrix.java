class Matrix{
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int [][] maat = {{1,2,3},{4,5,6},{7,8,9,10}};
        int c = 0;
        
    }

    static void printInSpiral(int firstcl, int lastcl, int firstrw, int lastrw, int ifirstcl, int ilastcl, int ifirstrw, int ilastrw, int[][] arr){

        if(firstcl == lastcl && firstrw == lastrw){
            return;
        }

        if(firstcl == lastcl){
            System.out.print(arr[firstcl][firstrw]);
            firstrw = ifirstrw+1;
            printInSpiral(firstcl, lastcl, firstrw, lastrw, ifirstcl, ilastcl, ifirstrw += 1, ilastrw, arr);
        }

        if(firstcl != lastcl){
            System.out.print(arr[firstcl][firstrw]);
            printInSpiral(firstcl = firstcl+1, lastcl, firstrw, lastrw, ifirstcl, ilastcl, ifirstrw, ilastrw, arr);
        }

    }



    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}