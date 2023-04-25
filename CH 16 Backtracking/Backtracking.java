class Backtracking{

    public static void findSubset(String str , String ans, int idx){
        //base case
        if(idx == str.length()){
            if(ans.length() == 0){
                System.out.println("Null");
                return;
            }else{
                System.out.println(ans);
                return;
            }
        }
        // firts check weather string say yes or no
        // yes
        findSubset(str, ans+str.charAt(idx), idx+1);
        //no
        findSubset(str, ans, idx+1);
    }
    public static void main(String args[]){
        findSubset("abc", "", 0);
    }
}