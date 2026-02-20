import java.util.Scanner;
public class Hotel16{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String roomCategory = sc.nextLine();
        String season = sc.nextLine();
        int nights = sc.nextInt();
        sc.nextLine();
        String loyalty = sc.nextLine();

        double baseRate = 0, seasonalMultiplier = 1;
        int stayDiscount = 0, loyaltyDiscount = 0;
        String upgrades = "None";

        if (roomCategory.equals("Standard")) baseRate = 150;
        else if (roomCategory.equals("Deluxe")) baseRate = 300;
        else if (roomCategory.equals("Suite")) baseRate = 500;
        else if (roomCategory.equals("Presidential")) baseRate = 1000;

        if (season.equals("Off-Peak")) seasonalMultiplier = 0.7;
        else if (season.equals("Regular")) seasonalMultiplier = 1.0;
        else if (season.equals("Peak")) seasonalMultiplier = 1.5;
        else if (season.equals("Holiday")) seasonalMultiplier = 2.0;

        if (nights >= 5 && nights <= 7) stayDiscount = 5;
        else if (nights >= 8 && nights <= 14) stayDiscount = 10;
        else if (nights >= 15) stayDiscount = 20;

        if (loyalty.equals("Member")) {
            loyaltyDiscount = 10;
            upgrades = "Free breakfast";
        } 
        else if (loyalty.equals("Gold")) {
            loyaltyDiscount = 15;
            upgrades = "Free breakfast and spa access";
        } 
        else if (loyalty.equals("Platinum")) {
            loyaltyDiscount = 20;
            upgrades = "Concierge service, airport transfer, and fine dining";
        }

        double seasonalRate = baseRate * seasonalMultiplier;
        double nightlyRate = seasonalRate * (1 - stayDiscount/100.0) * (1 - loyaltyDiscount/100.0);
        double total = nightlyRate * nights;

        System.out.println("Room Category: " + roomCategory);
        System.out.println("Season: " + season);
        System.out.println("Nights Booked: " + nights);
        System.out.println("Loyalty Tier: " + loyalty);
        System.out.println("Base Rate Per Night: $" + baseRate);
        System.out.println("Seasonal Multiplier: " + seasonalMultiplier + "x");
        System.out.println("Extended Stay Discount: " + stayDiscount + "%");
        System.out.println("Loyalty Discount: " + loyaltyDiscount + "%");
        System.out.println("Nightly Rate: $" + nightlyRate);
        System.out.println("Total Booking Cost: $" + total);
        System.out.println("Complimentary Upgrades: " + upgrades);
    }
}
    