public class Q2BinarySearchUsingMethod {

    public static int BinarySearch(int[] arr ,  int target){

        int left = 0;
        int right = arr.length-1;
        int result = -1;
        while(left <= right){

          int mid = left+(right - left)/2;
           if(arr[mid] == target){
            target = mid;
            break;
           }else if(target > arr[mid]){
            left = mid +1;
           }else{
            right = mid -1;
           }
        }
        return -1;
    }
    public static void main(String[] args){
            int[] nums ={12,13,14,16,17,19,20};
            int target = 16;
            int result = Q2BinarySearchUsingMethod.BinarySearch( nums, target);
            System.out.println("Index:" + result );
    }
}
