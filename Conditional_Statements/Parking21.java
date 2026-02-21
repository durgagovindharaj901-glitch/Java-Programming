import java.util.Scanner;
public class parking21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String locationZone = sc.nextLine();
        double parkingHours = sc.nextDouble();
        sc.nextLine();
        String vehicleType = sc.nextLine();
        String membershipStatus = sc.nextLin();

        double hourly_rate = 5.00;
        double zone_premium;
        double surcharge;
        double daily_cap;
        int discount;

        if(locationZone.equals(Downtown)) zone_premium = 50;
        else if(locationZone.equals(Business-District)) zone_premium = 30;
        else if(locationZone.equals(Residential)) zone_premium = 0;
        else if(locationZone.equals(Airport)) zone_premium = 100;

        if(vehicleType.equals(Motorcycle)) surcharge = -2;
        else if(vehicleType.equals(Compact)) surcharge = 0;
        else if(vehicleType.equals(Sedan)) surcharge = -0;
        else if(vehicleType.equals(SUV)) surcharge = 3;
        else if(vehicleType.equals(Oversized)) surcharge = 2;

        if(membershipStatus.equals(None)) discount = 0;
        if(membershipStatus.equals(Monthly)) discount = 20;
        if(membershipStatus.equals(Annual)) discount = 25;
        if(membershipStatus.equals(VIP)) discount = 30;

        if(parkingHours >= 24){
            daily_cap = "Yes";
            double fee = min(raw_fee * (1 - discount /100));
        }else{
            daily_cap = "No";
        }
        
        double raw_fee = (hourly_rate *(1+zone_premium / 100) + surcharge)*parkingHours;
        String category;

        if(zone_premium == 0){
            category = "Standard";
        }
        else if(zone_premium > 0 && zone_premium < 100){
            category = "Premium";
        }else{
            category = "Luxury";
        }
        
        System.out.println("Location Zone :"+locationZone);
        System.out.println("Parking Duration :"+parkingHours);
        System.out.println("Vehicle Type :"+vehicleType);
        System.out.println("Membership Status :"+membershipStatus);
        System.out.println("Base Hourly Rate :$"+hourly_rate);
        System.out.println("Zone Premium :"+zone_premium + "%");
        System.out.println("Vehicle Size Surcharge :$" + surcharge);
        System.out.println("Membership Discount :"+discount + "%");
        System.out.println("Total Parking Fee :$"+raw_fee);
        System.out.println("Daily Cap Applied :"+daily_cap);
        System.out.println("Rate Category :"+category);

    }
}