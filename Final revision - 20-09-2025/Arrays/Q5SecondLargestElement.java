/*Find the second largest lement */

import javax.sound.sampled.SourceDataLine;
import java.util.Arrays;
public class Q5SecondLargestElement {

    public static int SecondLargest(int[] arr){
           

           int largest = Integer.MIN_VALUE;
           int secondlargest = Integer.MIN_VALUE;

           for(int i=0 ; i<arr.length;i++ ){
               if(arr[i] >largest){
                secondlargest = largest;
                largest=arr[i];
               }
               else if(arr[i] > secondlargest && arr[i] < largest){
                secondlargest = arr[i];
               }
              
           }
           




    }
    public static void main(String[] args){
       
    }
}
