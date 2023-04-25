class EvenOddBinh{

    public static int[] evenOddBit(int n) {
        int Odd = 0;
        int even = 0;
        String convertt  = Integer.toBinaryString(1);
        for(int i = 0 ; i < convertt.length(); i++){
            if(convertt.charAt(i)=='1' && i%2 != 0){
                Odd++;
            }else if(convertt.charAt(i) !='1' && i %2 == 0){
                even++;
            }
        }
        return new int[] {Odd,even};
    }
    public static void main(String[] args) {

        evenOddBit(9);
        }
}