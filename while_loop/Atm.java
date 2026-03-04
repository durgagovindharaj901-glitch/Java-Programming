import java.util.Scanner;
public class Atm{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int balance=sc.nextInt();
        int i=1;
        int result=0;
        do{
            System.out.println("Balance : "+balance);
            System.out.println("Enter the withdrawal amount :");
            int withdrawl=sc.nextInt();
            if(withdrawl>100){
                if(withdrawl>balance){
                    System.out.println("Insufficient fund! Try again");
                }
                else if(withdrawl<=balance){
                    result=balance-withdrawal;
                    System.out.println("Withdrawal successful! Remaining balance : "+result);
                    break;
                }
            }
            else{
                System.out.println("Invalid amount! Try Again");
            }
            i++;
        }while(i>0 && i<10);
    }
}