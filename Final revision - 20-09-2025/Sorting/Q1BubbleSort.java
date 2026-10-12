package Sorting;

public class Q1BubbleSort {
    public static void main(String[] args){
        int[] arr = {23,56,12,78,23};
        System.out.print("Unsortedarray: ");
        for(int i=0;i<arr.length;i++){
            System.out.print( arr[i] +" ");
        }
        for(int i=0; i<arr.length-1;i++){
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted array:");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

    }
}
