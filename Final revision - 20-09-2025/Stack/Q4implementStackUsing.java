package Stack;

public class Q4implementStackUsing {
      int[] arr;
      int top=-1;

      Q4implementStackUsing(int size){
            arr=new int[size];
      }

      void push(int x){
        if(top == arr.length-1) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] =x;
      }
}
