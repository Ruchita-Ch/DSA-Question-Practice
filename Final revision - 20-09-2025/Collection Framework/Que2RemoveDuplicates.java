
import java.util.HashSet;

public class Que2RemoveDuplicates {
    public static void main(String[] args){
          int[] nums = {1,2,2,1,1,4,254,378,532,3,2};
          
          HashSet <Integer> set = new HashSet<>();
          for(int num : nums){
               if(set.add(num)){
                  System.out.println(num);
               }
          }
         
    }
}
