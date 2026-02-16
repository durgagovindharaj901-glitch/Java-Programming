import java.util.Scanner;
public class CarRent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int rentaldays = sc.nextInt();
        int rentPerDay = sc.nextInt();
        int lateCharges = sc.nextInt();
        int fuelCost = sc.nextInt();
        int maintenanceCost = sc.nextInt();

        int profit = (rentaldays * rentPerDay) + lateCharges - fuelCost - maintenanceCost;
        System.out.println("Net Profit = "+profit);
    }
}