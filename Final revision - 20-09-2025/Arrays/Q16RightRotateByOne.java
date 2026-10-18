public class Q16RightRotateByOne {

    public static void main(String[] args){
         int[] arr = {12,13,14,15,16,17};
         int n =  arr.length;
         int temp = arr[n-1];

         for( int i=n-2; i>=0;i--){

            arr[i+1] = arr[i];
         }
         arr[0] = temp;
    
    for(int i=0; i<=n-1; i++){
        System.out.print(arr[i] +" ");
    }
    
}
}
