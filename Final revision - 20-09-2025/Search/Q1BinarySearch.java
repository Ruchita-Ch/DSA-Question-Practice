package Search;
/*
binary search has a best case time complexity of O(1) and average- and worst case time complexity of O(log n) 
because iti halves the search space in every iteration. Its auxillary
space complexity is O(1) for the iterative approch and O(log n) for the
recursive approch 


*/
public class Q1BinarySearch {
      public static void main(String[] args){
         
        int[] nums = {1,2,3,4,5,6};
        int target = 43;

        int left = 0;
        int right = nums.length-1;
        int result = -1;
        while(left<=right){
            int mid = left+ (right -left)/2;

            if(nums[mid] == target){
                result = mid;
                break;
            }else if(target < nums[mid]){
                right = mid-1;

            }else{
                left = mid+1;
            }
        }
        System.out.println(result);


      }
}
