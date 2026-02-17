import java.util.Scanner;
public class Loan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int cred_scr = sc.nextInt();
        
        if(salary > 25000 && cred_scr > 700){
            System.out.println("Approved");
        }else{
            System.out.println("Rejected");
        }
    }
}