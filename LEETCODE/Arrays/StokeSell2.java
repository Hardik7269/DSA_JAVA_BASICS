class StokeSell2 {
    public static boolean isSorted(int arr[]){
        int countstr = 0;
        //for countstr
        for(int i = 0 ; i < arr.length-1 ; i ++){
            if(arr[i] < arr[i+1]){
                countstr++;
            }
        }

        if(countstr != arr.length -1){
            return false;
        }
        return true;

    }
    public static boolean isRevSorted(int arr[]){
        int countrev = 0;
        // for countrev
        for(int i = 0 ; i < arr.length-1 ; i ++){
            if(arr[i] > arr[i+1]){
                countrev++;
            }
        }
        if(countrev != arr.length -1){
            return false;
        }
        return true;
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length == 1){
            return 0;
        }
        if(isSorted(prices)){
            return Math.abs(prices[0]-prices[prices.length-1]);
        }
        else if(isRevSorted(prices)){
            return 0;
        }
        else{

            for(int i = 1 ; i < prices.length ; i++){ 
                if(prices[i-1] < prices[i]){
                    profit += prices[i] - prices[i-1];
                }
            }            
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }
}