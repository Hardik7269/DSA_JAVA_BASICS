public class RemoveDuplicateString{

    public static void fun(int index, StringBuilder nweString , boolean check[] , String str ){

        //basecase
        if(index == str.length()){
            System.out.print(nweString);
            return;
        }
        //kaam
        char curr = str.charAt(index);

        if(check[curr - 'a'] != true){
            nweString.append(str.charAt(index));
            check[curr - 'a'] = true;
        }
        fun(index+1, nweString, check, str);
    }

    
    public static void main(String[] args) {
        String str = "haarrdikh";
        boolean check [] = new boolean [26];
        fun(0, new StringBuilder(""), check,str);
    }
}