public class Que4CountUniqueEle {


    public static int count(int[] arr){
         int i =0;

         for(int j=1; j<arr.length; j++){
            if(arr[j] != arr[i]){
                i++;
                arr[i] = arr[j]; 
            }
         }
         return i+1;

    }
    public static void main(String[] args){
          int[] arrays = {0,0,1,1,2,3,4,55,55,78,78,9090,9090};
           int counts = count(arrays);
           System.out.println(counts);

           for(int index=0; index<counts ;index++){
               System.out.print(arrays[index] + " ");
           }

    }

}
