public class bionomialfun{

    public static int fact(int n){
        int fact = 1;
        for(int i= 1; i<=n ; i ++){
            fact = fact * i ;
        }
        return fact;
    }

    public static float bionomialaf(int a , int b){
        float nfact = fact(a);
        float rfact = fact(b);
        float nrfact = fact(a-b);

        float bionomialfun = nfact / (rfact * nrfact) ;
        return bionomialfun;
    }

    public static void main(String args[]){
        System.out.println(bionomialaf(5, 4));
    }
}