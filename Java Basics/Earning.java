import java.util.Scanner;
public class Earning{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int deliveries = sc.nextInt();
        int payoutPerDelivery = sc.nextInt();
        int incentive = sc.nextInt();
        int fuelCost = sc.nextInt();

        int Net_Earnings = (deliveries * payoutPerDelivery )+ incentive - fuelCost;
        System.out.println("Deliveries payout incentive = "+Net_Earnings);
    }
}