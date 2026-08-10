import java.util.*;
public class Que5Intersection {

    public static int[] intersection(int[]nums1 , int[] nums2){
          HashSet <Integer> set1 = new HashSet<>() ;
          HashSet <Integer> result = new HashSet<>();
           

          for(int num : nums1){
            set1.add(num);
          }

          for(int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }
          }

         int[] arr = new int[result.size()];

         int i=0;
         for(int num: result){
            arr[i] = num;
            i++;
         }
         return arr;

    } 
    public static void main(String [] args){
            int[] arr1 = {1,1,1,8,4,2,7,5};
            int[] arr2 = {3,2,6,71,8,1,2,8};

            int[] finalresult =intersection(arr1, arr2);
            System.out.println(Arrays.toString(finalresult));


    }

}
