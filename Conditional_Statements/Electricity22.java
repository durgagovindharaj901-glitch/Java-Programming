import java.util.Scanner;
public class Electricity22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int unitsConsumed = sc.nextInt();
        sc.nextLine();
        String consumerType = sc.nextLine();
        String season = sc.nextLine();
        String paymentMethod = sc.nextLine();

        double ratePerunit = 0.0;

        if(consumerType.equals("Residential")){
            if(unitsConsumed >= 0 && unitsConsumed <= 100){
                ratePerunit = 0.10;
            }
            else if(unitsConsumed >= 101 && unitsConsumed <= 300){
                ratePerunit = 0.15;
            }
            else if(unitsConsumed >= 301 && unitsConsumed <= 500){
                ratePerunit = 0.25;
            }
            else{
                ratePerunit = 0.30;
            }
        }
        if(consumerType.equals("Commercial")){
            if(unitsConsumed >= 0 && unitsConsumed <= 100){
                ratePerunit = 0.12;
            }
            else if(unitsConsumed >= 101 && unitsConsumed <= 300){
                ratePerunit = 0.18;
            }
            else if(unitsConsumed >= 301 && unitsConsumed <= 500){
                ratePerunit = 0.25;
            }
            else{
                ratePerunit = 0.25;
            }
        }
        if(consumerType.equals("Industrial")){
            if(unitsConsumed >= 0 && unitsConsumed <= 100){
                ratePerunit = 0.08;
            }
            else if(unitsConsumed >= 101 && unitsConsumed <= 300){
                ratePerunit = 0.12;
            }
            else if(unitsConsumed >= 301 && unitsConsumed <= 500){
                ratePerunit = 0.20;
            }
            else{
                ratePerunit = 0.20;
            }
        }

        double seasonal_adjustment = 0.0;

        if(season.equals("Summer")) seasonal_adjustment = 15;
        else if(season.equals("Winter")) seasonal_adjustment = -10;
        else if(season.equals("Regular")) seasonal_adjustment = 0;

        double discount = 0.0;
        if(paymentMethod.equals("Auto-Pay")) discount = 5;
        if(paymentMethod.equals("Online")) discount = 3;
        if(paymentMethod.equals("Manual")) discount = 0;

        double charge = unitsConsumed * ratePerunit;
        double total = charge + seasonal_adjustment - discount;
        double average = total / unitsConsumed;


        System.out.println("Units Consumed :"+unitsConsumed);
        System.out.println("Customer Type :"+consumerType);
        System.out.println("Season:"+season);
        System.out.println("Payment Method :"+paymentMethod);
        System.out.println("Tier 1 Cost(0-100):"+ratePerunit);
        System.out.println("Tier 2 Cost(101-300):"+ratePerunit);
        System.out.println("Tier 3 Cost(301-500):"+ratePerunit);
        System.out.println("Tier 4 Cost(501+):"+ratePerunit);
        System.out.println("Seasonal Adjustment :"+seasonal_adjustment);
        System.out.println("Payment Discount :"+discount);
        System.out.println("Total Bill :"+total);
        System.out.println("Average Rate :"+average);
        }
}

