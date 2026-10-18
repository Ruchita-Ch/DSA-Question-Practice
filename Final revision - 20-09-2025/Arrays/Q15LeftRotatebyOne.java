public class Q15LeftRotatebyOne {
    public static void main(String[] args){
           

        int[] arr = {12,13,14,15,16,17};
        int n= arr.length;
         int temp= arr[0];
        for(int i=1; i<= arr.length-1; i++){
                arr[i-1] = arr[i];
        }
        
            arr[n-1] = temp;
            for(int i=0; i<=n-1; i++){
                System.out.print(arr[i]+" ");
            }

           
    }
}
