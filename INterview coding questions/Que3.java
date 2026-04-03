import java.util.Scanner;

public class Que3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount:");
        double Amount = sc.nextInt();
        double finalpayableamount = 0;
        if(Amount < 1000){
           finalpayableamount = Amount - ( Amount * 5/100);
        }else if( Amount > 1000  && Amount < 5000){
            finalpayableamount = Amount - ( Amount * 10/100);
        }else if( Amount > 5000){
            finalpayableamount = Amount - ( Amount * 15/100);
        }else if( Amount == 0){
            System.out.println("Error");

        }

    }
}
