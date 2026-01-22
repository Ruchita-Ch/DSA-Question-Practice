package Hashset;
/*Problem:
Check if an array contains duplicate elements

Example:
arr = {1, 2, 3, 4, 1}
Output → true */

import java.util.HashSet;
public class Q1ContainsDuplicates {
    public static void main(String[] args){
          int[] arr= {1,2,3,4,1,5,6,9};

          HashSet<Integer> set = new HashSet<>();

          boolean hasDuplicate = false;

          for(int num: arr){
            if(set.contains(num)){
                hasDuplicate = true;
                break;
            }

            set.add(num);
          }

          System.out.println(hasDuplicate);

    }
}
