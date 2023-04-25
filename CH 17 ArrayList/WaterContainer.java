import java.util.ArrayList;

class WaterContainer{
    
    public static int containedWater(ArrayList<Integer> list){
        int maxContain = 0;
        for(int i = 0 ; i < list.size()-1 ; i ++){
            for(int j = i+1 ; j < list.size() ; j++){
                int width = j - i;
                int height = Math.min(list.get(i) , list.get(j));
                maxContain = Math.max(maxContain, (width*height));
            }
        }
        return maxContain;
    }

    public static int optimized(ArrayList<Integer> list){
        int maxContain = 0;
        int lp = 0;
        int rp = list.size() - 1 ;

        while(lp < rp){
        int width = rp - lp;
        int height = Math.min(list.get(lp) , list.get(rp));
        maxContain = Math.max(maxContain, (width*height));

        if(list.get(lp) <= list.get(rp)){
            lp++;
        }
        else if (list.get(rp) <= list.get(lp)){
            rp--;
        }
        
    }       
    return maxContain;
} 
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(7);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.println(height);
        System.out.println(optimized(height));

    }
}