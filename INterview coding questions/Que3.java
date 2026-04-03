import java.util.Scanner;

public class Que3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Amount:");
        double Amount = sc.nextDouble();
        if (Amount <= 0){
            System.out.println("Error : Invalid amount.");
            return;
        }
        
        double finalpayableamount = 0;
        if(Amount < 1000){
           finalpayableamount = Amount - ( Amount * 5/100);
        }else if( Amount >= 1000  && Amount < 5000){
            finalpayableamount = Amount - ( Amount * 10/100);
        }else{
            finalpayableamount = Amount - ( Amount * 15/100);
        }
        System.out.println("Final Payable amount after discount is: " + finalpayableamount);

    }
}
