package Sorting;

public class Q2optimisedBubbleSort {
     public static void main(String[] args){
        int[] arr = {12,67,23,89,45,2};
        for(int i=0; i<arr.length;i++){
            boolean swapped = false;
            for(int j=1; j<arr.length-i;j++){

                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    swapped = true;
                }
            }

            if(!swapped){
                break;
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
     }
}
