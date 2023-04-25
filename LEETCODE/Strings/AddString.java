class AddString{
    
    public static String addStrings(String num1, String num2) {
        int n1 = 0;
        int n2 = 0;
        for(int i = 0 ; i < num1.length() ; i++){
            char c = num1.charAt(i);
            int a = c - '0';
            n1 += a*Math.pow(10,(num1.length()-1-i));
        }
        for(int i = 0 ; i < num2.length() ; i++){
            char c = num2.charAt(i);
            int a = c - '0';
            n2 += a*Math.pow(10,(num2.length()-1-i));
        }
        return String.valueOf(n1+n2);
    }

    public static void main(String[] args) {
        String  num1 = "11";
        String  num2 = "123";
        System.out.println(addStrings(num1,num2));
    }
}