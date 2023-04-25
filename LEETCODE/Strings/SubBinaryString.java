class SubBinaryString{
    public static int findTheLongestBalancedSubstring(String s) {
        int cz = 0;
        int maxLength = 0;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '0'){
                cz++;
            }
            if(s.charAt(i) == '1'){
                int co = 0;
                for(int j = i ; j <= cz+i ; j++){

                    if(s.charAt(j) == '0'){
                        maxLength = Math.max(maxLength ,(2*Math.min(co,cz)));
                        cz=0;
                        co=0;
                        i = j-1;
                        break;
                    }
                    
                    if(s.charAt(j) == '1'){
                        co++;
                    }
                   
                    maxLength = Math.max(maxLength ,(2*Math.min(co,cz)));

                    if(j == s.length()-1){
                        return maxLength;
                    }
                }
            }
        }
        return maxLength;
    }
    public static void main(String[] args) {
        System.out.println(findTheLongestBalancedSubstring("10111000011101"));
    }
}