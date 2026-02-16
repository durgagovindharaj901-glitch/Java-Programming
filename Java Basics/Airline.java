import java.util.Scanner;
public class Airline{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int weight = sc.nextInt();
        int ratePerKg = sc.nextInt();
        int priorityCharge = sc.nextInt();
        int insuranceFess = sc.nextInt();
        int handlingCharges = sc.nextInt();
        int fuelSurcharge = sc.nextInt();

        int cargo = (weight * ratePerKg) + priorityCharge + insuranceFess - handlingCharges - fuelSurcharge;
        System.out.println("Cargo Revenue = "+cargo);
    }
}