public class Str{
    public static String substr (String str , int st , int ed){
        String substrr = "";
        for(int i = st ; i < ed ; i++){
            substrr += str.charAt(i);
            
        }
        return substrr;
    }
    public static void strBuilder(){
        StringBuilder sb = new StringBuilder("");
        for(char i = 'a' ; i <= 'z' ; i++){
            sb.append(i);
        }
        System.out.println(sb);
        
    }
    public static StringBuilder toUpperCase(String strr){
        StringBuilder sb = new StringBuilder("");
        
        sb.append(Character.toUpperCase(strr.charAt(0)));

        for(int i = 1 ; i < strr.length() ; i++){
            sb.append(str.charAt(i));
            if(str.charAt(i) == ' '){
                sb.append(Character.toUpperCase(strr.charAt(i+1)));
                i++;
            }
        }
        return sb;
    }
    public static StringBuffer stringCompression(String str){
        StringBuffer sb = new StringBuffer("");
        
        for(Integer i = 0 ; i < str.length(); i++ ){
            Integer count = 1;
            for(Integer j = i ; j < str.length() -1 ; j++){ 
                if(str.charAt(i) == str.charAt(i+1)){
                    count++;
                    i++;
                }else{
                    break;
                }
            }
            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
            
        }
        return sb;
    }
    public static void main(String[] args) {
        
        // String str = new String("");
        // System.out.println(str);
        // System.out.println(substr(str, 0, 8));
        // System.out.println(str.substring(0,8));
        // strBuilder();

        // String strr = "h ardi k limbachiya";
        // System.out.println(toUpperCase(str));

        String str = "aaaabbeeeef";
        System.out.println(stringCompression(str));
    }
}