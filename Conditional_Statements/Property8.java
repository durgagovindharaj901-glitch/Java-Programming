import java.util.Scanner;
public class Property8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String locationTier = sc.nextLine();
        int squareFootage = sc.nextInt();
        int propertyAge = sc.nextInt();
        int amenityScore = sc.nextInt();

        double basePricePerSqFt = 0.0;
        int ageAdjustmentPercent = 0;
        double amenityBonus = 0.0;
        String marketCategory = "";

        if (locationTier.equalsIgnoreCase("Prime")) {
            basePricePerSqFt = 400;
        } else if (locationTier.equalsIgnoreCase("Urban")) {
            basePricePerSqFt = 300;
        } else if (locationTier.equalsIgnoreCase("Suburban")) {
            basePricePerSqFt = 180;
        } else if (locationTier.equalsIgnoreCase("Rural")) {
            basePricePerSqFt = 100;
        } else {
            System.out.println("Invalid location tier");
            return;
        }

        double baseValue = squareFootage * basePricePerSqFt;

        if (propertyAge <= 5) {
            ageAdjustmentPercent = 0;
        } else if (propertyAge <= 15) {
            if (propertyAge <= 10) {
                ageAdjustmentPercent = -5;
            } else {
                ageAdjustmentPercent = -10;
            }
        } else if (propertyAge <= 30) {
            if (propertyAge <= 25) {
                ageAdjustmentPercent = -15;
            } else {
                ageAdjustmentPercent = -20;
            }
        } else {
            ageAdjustmentPercent = -25;
        }

        double adjustedValue = baseValue * (1 + ageAdjustmentPercent / 100.0);

        if (amenityScore >= 80) {
            amenityBonus = baseValue * 0.10;
        } else if (amenityScore >= 60) {
            amenityBonus = baseValue * 0.05;
        } else if (amenityScore >= 40) {
            amenityBonus = baseValue * 0.02;
        } else {
            amenityBonus = 0;
        }

        double finalValue = adjustedValue + amenityBonus;

        if ((locationTier.equalsIgnoreCase("Prime") || 
             locationTier.equalsIgnoreCase("Urban")) && propertyAge < 15) {
            marketCategory = "Hot";
        } else if (locationTier.equalsIgnoreCase("Suburban")) {
            marketCategory = "Stable";
        } else if (locationTier.equalsIgnoreCase("Rural") || propertyAge > 30) {
            marketCategory = "Slow";
        } else {
            marketCategory = "Stable";
        }

        System.out.println("Location Tier: " + locationTier);
        System.out.println("Square Footage: " + squareFootage + " sq ft");
        System.out.println("Property Age: " + propertyAge + " years");
        System.out.println("Amenity Score: " + amenityScore);
        System.out.println("Base Price Per Sq Ft: $" + basePricePerSqFt);
        System.out.println("Age Adjustment: " + ageAdjustmentPercent + "%");
        System.out.println("Amenity Bonus: $" + amenityBonus);
        System.out.println("Estimated Property Value: $" + finalValue);
        System.out.println("Market Category: " + marketCategory);

    }
}