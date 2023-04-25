public class que{
    
    public static int countLowerCase(String str){
        int i = 0, count = 0;
        while(i < str.length()){
            char ch = str.charAt(i);

            switch (ch){
                case 'a' : count++ ; i++ ;
                break;
                case 'e' : count++ ; i++ ;
                break;
                case 'i' : count++ ; i++ ;
                break;
                case 'o' : count++ ; i++ ;
                break;
                case 'u' : count++ ; i++ ;
                break;
                default : i ++ ;
            }
        }
        return count;
    }
    public static boolean anagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }

        for(int i = 0 ; i < str1.length() ; i++){
            int count = 0;
            for(int j = 0 ; j < str2.length() ; j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    count++;
                }             
            }
            if(count == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        // String str = "Hardik Limbachiya";
        // System.out.println(countLowerCase(str));

        String str1 = "reace";
        String str2 = "caree";
        System.out.println(anagram(str1, str2));
    }
}