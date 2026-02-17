import java.util.Scanner;
public class Atm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int acc_bal = sc.nextInt();
        int with_amt = sc.nextInt();
        int daily_limit = sc.nextInt();
    
        if(acc_bal >= with_amt && with_amt <= daily_limit){
            System.out.println("Approved");
        }else{
            System.out.println("Declined");
        }
    }
}