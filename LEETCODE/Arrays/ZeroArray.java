import java.util.*;

public class ZeroArray{
    public static void sorting(Integer nums[]){
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                count++;
            }
        }
        if(count == nums.length){
            return;
        }
      for(int nz = 1 ; nz < nums.length ; nz++){
          for(int z = nz-1 ; z>=0 ; z--){
              if(nums[nz]!=0 && nums[z] == 0){
                  int temp = nums[nz];
                  nums[nz] = nums[z];
                  nums[z] = temp;
              }
              if(nums[nz]==0 && nums[z]==0){
                  if(nz == nums.length-1){
                      break;
                  }
                  nz++;
                  int temp = nums[nz];
                  nums[nz] = nums[z];
                  nums[z] = temp;
                  nz--;
                  z++;
              }
          }
      }
    }

    public static void main(String[] args) {
        Integer nums []= {4,2,4,0,0,3,0,5,1,0};
        sorting(nums); 
        // 8
    }
}