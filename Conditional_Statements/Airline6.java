import java.util.Scanner;
public class Airline6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String bookingClass = sc.nextLine();
        int daysUntilDeparture = sc.nextInt();
        double seatAvailability = sc.nextDouble();
        sc.nextLine(); 
        String routeType = sc.nextLine();

        double basePrice = 0.0;
        double demandMultiplier = 1.0;
        String pricingCategory = "Moderate";

        if (bookingClass.equalsIgnoreCase("Economy")) {
            if (routeType.equalsIgnoreCase("Domestic")) {
                basePrice = 200;
            } else if (routeType.equalsIgnoreCase("International-Short")) {
                basePrice = 500;
            } else if (routeType.equalsIgnoreCase("International-Long")) {
                basePrice = 800;
            }
        } else if (bookingClass.equalsIgnoreCase("Business")) {
            if (routeType.equalsIgnoreCase("Domestic")) {
                basePrice = 600;
            } else if (routeType.equalsIgnoreCase("International-Short")) {
                basePrice = 1500;
            } else if (routeType.equalsIgnoreCase("International-Long")) {
                basePrice = 2500;
            }
        } else if (bookingClass.equalsIgnoreCase("First")) {
            if (routeType.equalsIgnoreCase("Domestic")) {
                basePrice = 1000;
            } else if (routeType.equalsIgnoreCase("International-Short")) {
                basePrice = 3000;
            } else if (routeType.equalsIgnoreCase("International-Long")) {
                basePrice = 5000;
            }
        }

        if (seatAvailability < 30 && daysUntilDeparture < 14) {
            demandMultiplier = 1.8;
            pricingCategory = "High Demand";
        } else if (seatAvailability < 50 && daysUntilDeparture < 30) {
            demandMultiplier = 1.5;
            pricingCategory = "High Demand";
        } else if (seatAvailability >= 60 && daysUntilDeparture > 60) {
            demandMultiplier = 0.8;
            pricingCategory = "Low Demand";
        } else {
            demandMultiplier = 1.3;
            pricingCategory = "Moderate";
        }

        double finalPrice = basePrice * demandMultiplier;

        System.out.println("Booking Class: " + bookingClass);
        System.out.println("Days Until Departure: " + daysUntilDeparture);
        System.out.println("Seat Availability: " + seatAvailability + "%");
        System.out.println("Route Type: " + routeType);
        System.out.println("Base Price: " + basePrice);
        System.out.println("Demand Multiplier: " + demandMultiplier + "x");
        System.out.println("Final Ticket Price: " + finalPrice);
        System.out.println("Pricing Category: " + pricingCategory);

       
    }
}