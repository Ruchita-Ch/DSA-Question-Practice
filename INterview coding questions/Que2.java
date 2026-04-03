/*
💡 Concept (simple)

Each digit has holes:

0, 4, 6, 9 → 1 hole
8 → 2 holes
1, 2, 3, 5, 7 → 0 holes
 */

public class Que2 {
    public static int returnhole(int num){
        int holes = 0;
        while(num > 0){
           int curr = num % 10;
           if(curr == 0 || curr == 4 ||curr == 6 ||curr == 9 ){
            holes += 1;
           }else if( curr == 8){
              holes +=2;
           }
           num = num/10;
           
        }
        return holes;
    }
    public static void main(String[] args){
          int number = 3485980;
        System.out.println( returnhole(number));

    }
}
