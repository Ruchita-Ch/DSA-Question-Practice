package Stack;
 import java.util.Stack;
public class Q1builtInStack {
     public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        
        System.out.println(stack);

        //peek to see the top element
        System.out.println(stack.peek());

        //pop - remove top
        System.out.println(stack.pop());

        System.out.println(stack);

     }
}
