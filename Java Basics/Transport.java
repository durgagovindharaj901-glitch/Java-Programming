import java.util.Scanner;
public class Transport{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int distance = sc.nextInt();
        int ratePerKm = sc.nextInt();
        int maintenance = sc.nextInt();
        int driverAllowance = sc.nextInt();
        int subsidy = sc.nextInt();

        int fees = (distance * ratePerKm )+ maintenance + driverAllowance - subsidy;
        System.out.println("Total Transport Fee = "+fees);
    }
}