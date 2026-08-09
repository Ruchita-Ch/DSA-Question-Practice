

import java.util.HashSet;

public class Que1Duplicates {
    public static void main(String[] args){
          int[] arr = {1,2,3,44,211,2,3,44};
          
          HashSet<Integer> set = new HashSet<>();

          for(int num : arr){

            if(!set.add(num)){
                System.out.println("Duplicates: " + num);
            }
          }
    }
}
