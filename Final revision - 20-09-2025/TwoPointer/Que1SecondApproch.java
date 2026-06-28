package TwoPointer;

public class Que1SecondApproch {
    public static void main (String[] args){

        for(int i=0 ; i=<arr.length; i++){
            for(int j=i=1; j<arr.length-1; j+++){
                 int temp = arr[i];
                 arr[i] = arr[j];
                 arr[j] = arr[i];
                 
            }
        }
    }
}
