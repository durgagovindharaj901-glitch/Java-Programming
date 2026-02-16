import java.util.Scanner;
public class Railway{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int genPass = sc.nextInt();
        int genFare = sc.nextInt();
        int acPass = sc.nextInt();
        int acFare = sc.nextInt();
        int platform = sc.nextInt();
        int maintenanceCost = sc.nextInt();
        int fuelCost = sc.nextInt();

        int Net_revenue = (genPass * genFare) + (acPass * acFare) + platform - maintenanceCost - fuelCost;
        System.out.println("Net Railway Revenue = "+Net_revenue);
    }
}