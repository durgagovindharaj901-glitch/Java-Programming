import java.util.Scanner;
public class Time18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double weight = sc.nextDouble();
        sc.nextLine();
        String zone = sc.nextLine();
        String speed = sc.nextLine();
        String size = sc.nextLine();

        double baseRate = 0, zoneMultiplier = 1, sizeSurcharge = 0;
        double weightSurcharge = weight * 1;
        String delivery = "";
        String service = "";

        if (speed.equals("Economy")) { baseRate = 5; service = "Budget"; }
        else if (speed.equals("Standard")) { baseRate = 10; service = "Standard"; }
        else if (speed.equals("Express")) { baseRate = 25; service = "Priority"; }
        else if (speed.equals("Overnight")) { baseRate = 50; service = "Premium"; }

        if (zone.equals("Local")) zoneMultiplier = 1.0;
        else if (zone.equals("Regional")) zoneMultiplier = 1.2;
        else if (zone.equals("National")) zoneMultiplier = 1.5;
        else if (zone.equals("International")) zoneMultiplier = 3.0;

        if (size.equals("Medium")) sizeSurcharge = 5;
        else if (size.equals("Large")) sizeSurcharge = 15;
        else if (size.equals("Oversized")) sizeSurcharge = 30;

        if (speed.equals("Overnight")) delivery = "1";
        else if (speed.equals("Express")) {
            if (zone.equals("Local")) delivery = "1";
            else if (zone.equals("Regional")) delivery = "1-2";
            else if (zone.equals("National")) delivery = "2-3";
            else delivery = "3-5";
        }
        else if (speed.equals("Standard")) {
            if (zone.equals("Local")) delivery = "2-3";
            else if (zone.equals("Regional")) delivery = "3-5";
            else if (zone.equals("National")) delivery = "5-7";
            else delivery = "10-14";
        }
        else {
            if (zone.equals("Local")) delivery = "3-5";
            else if (zone.equals("Regional")) delivery = "5-7";
            else if (zone.equals("National")) delivery = "7-10";
            else delivery = "14-21";
        }

        double baseCost = (baseRate + weightSurcharge) * zoneMultiplier;
        double total = baseCost + sizeSurcharge;

        System.out.println("Package Weight: " + weight + " lbs");
        System.out.println("Destination Zone: " + zone);
        System.out.println("Shipping Speed: " + speed);
        System.out.println("Package Size: " + size);
        System.out.println("Base Shipping Rate: $" + baseRate);
        System.out.println("Weight Surcharge: $" + weightSurcharge);
        System.out.println("Zone Multiplier: " + zoneMultiplier + "x");
        System.out.println("Size Surcharge: $" + sizeSurcharge);
        System.out.println("Total Shipping Cost: $" + total);
        System.out.println("Estimated Delivery: " + delivery + " business days");
        System.out.println("Service Level: " + service);
    }
}
   