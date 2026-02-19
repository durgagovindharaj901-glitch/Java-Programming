import java.util.Scanner;
public class Energy10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String timeOfDay = sc.nextLine();
        double powerConsumption = sc.nextDouble();
        double renewablePercentage = sc.nextDouble();
        sc.nextLine();
        String rateTier = sc.nextLine();

        double baseRate = 0.0;
        double rateMultiplier = 1.0;
        double renewableCredit = 0.0;
        double totalCost = 0.0;
        String recommendation = "";
        double potentialSavings = 0.0;

        if (rateTier.equalsIgnoreCase("Basic")) {
            baseRate = 0.18;
        } else if (rateTier.equalsIgnoreCase("Time-of-Use")) {
            baseRate = 0.15;
        } else if (rateTier.equalsIgnoreCase("Premium-Green")) {
            baseRate = 0.12;
        }

        if (timeOfDay.equalsIgnoreCase("Peak")) {
            if (rateTier.equalsIgnoreCase("Time-of-Use")) {
                rateMultiplier = 1.8;
            } else if (rateTier.equalsIgnoreCase("Premium-Green")) {
                rateMultiplier = 1.5;
            } else {
                rateMultiplier = 1.5;
            }
        } else if (timeOfDay.equalsIgnoreCase("Off-Peak")) {
            if (rateTier.equalsIgnoreCase("Time-of-Use")) {
                rateMultiplier = 0.8;
            } else {
                rateMultiplier = 1.0;
            }
        } else if (timeOfDay.equalsIgnoreCase("Super-Off-Peak")) {
            if (rateTier.equalsIgnoreCase("Premium-Green")) {
                rateMultiplier = 0.6;
            } else {
                rateMultiplier = 0.5;
            }
        }

        renewableCredit = (powerConsumption * renewablePercentage / 100.0) * baseRate;

        totalCost = (powerConsumption * baseRate * rateMultiplier) - renewableCredit;
        if (totalCost < 0) totalCost = 0;

        if (timeOfDay.equalsIgnoreCase("Peak") && renewablePercentage < 30) {
            recommendation = "Shift high-power appliances to Off-Peak hours";
            potentialSavings = powerConsumption * baseRate * (rateMultiplier - 0.8);
        } else if (renewablePercentage >= 70) {
            recommendation = "Great renewable usage! Minor peak reduction possible";
            potentialSavings = powerConsumption * baseRate * (rateMultiplier - 1.2);
        } else if (rateTier.equalsIgnoreCase("Basic") && powerConsumption > 20) {
            recommendation = "Consider upgrading to Time-of-Use plan";
            potentialSavings = powerConsumption * 0.03;
        } else if (timeOfDay.equalsIgnoreCase("Super-Off-Peak")) {
            recommendation = "Excellent! Maximize appliance use during this period";
            potentialSavings = 0;
        } else {
            recommendation = "Good timing! Consider increasing renewable capacity";
            potentialSavings = 0;
        }

        System.out.println("Time of Day: " + timeOfDay);
        System.out.println("Power Consumption: " + powerConsumption + " kWh");
        System.out.println("Renewable Energy: " + renewablePercentage + "%");
        System.out.println("Rate Tier: " + rateTier);
        System.out.println("Base Rate: $" + baseRate + "/kWh");
        System.out.println("Rate Multiplier: " + rateMultiplier + "x");
        System.out.println("Renewable Credit: $" + renewableCredit);
        System.out.println("Total Cost: $" + totalCost);
        System.out.println("Optimization Recommendation: " + recommendation);
        System.out.println("Potential Savings: $" + potentialSavings);

    }
}