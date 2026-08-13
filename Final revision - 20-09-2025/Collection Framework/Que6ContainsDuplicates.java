import java.util.*;
public class Que6ContainsDuplicates {
    public static boolean checkduplicates(int[] array){
        HashSet<Integer> set = new HashSet<>();

        for(int num : array){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
    public static void main(String [] args){
           int[] nums = {112,112,67,42,32,8};
     boolean ans = checkduplicates(nums);
     System.out.println(ans);

    }
}
