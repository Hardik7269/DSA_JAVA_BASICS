class FindVowel {
    public static int vowelStrings(String[] words, int left, int right) {
           int count = 0;
           for(int i = left ; i <= right ; i++){
               String str = words[i];
               boolean isVowel = false;
               if(str.length() == 1){
                   count++;
                   continue;
               }
               for(int j = 0 ; j < str.length() ; j += (str.length()-1)){
                   if(str.charAt(j) == 'a' || str.charAt(j) == 'e' || str.charAt(j) == 'i' || str.charAt(j)== 'o' ||str.charAt(j) == 'u'){
                       isVowel = true;
                      }
                   else{
                           isVowel = false;
                          break;
                      }
               }
                     if(isVowel == true){
                         count++;
                     } 
           }
                      return count;
       }
       public static void main(String[] args) {
            String words[] ={ "n" , "o", "u"}; 
            System.out.println(vowelStrings(words, 0, 2));
       }
   }