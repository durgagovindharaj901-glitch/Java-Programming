import java.util.Scanner;
public class Data25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dataGB = sc.nextDouble();
        int minutes = sc.nextInt();
        sc.nextLine();
        String intl = sc.nextLine();
        String device = sc.nextLine();

        String plan;
        double baseCost;
        double dataOver = 0;
        double callOver = 0;

        if (dataGB <= 2 && minutes <= 500) {
            plan = "Basic 2GB";
            baseCost = 25;
        } else if (dataGB <= 5 && minutes <= 1000) {
            plan = "Standard 5GB";
            baseCost = 40;
            if (dataGB > 5) dataOver = (dataGB - 5) * 10;
        } else if (dataGB <= 25 && minutes <= 2000) {
            plan = "Premium Unlimited";
            baseCost = 70;
        } else {
            plan = "Unlimited Max";
            baseCost = 90;
        }

        double intlFee = 0;
        if (intl.equals("Light")) intlFee = 5;
        else if (intl.equals("Moderate")) intlFee = 15;
        else if (intl.equals("Heavy")) intlFee = 30;

        double deviceFee = 0;
        if (device.equals("Smartphone")) deviceFee = 10;
        else if (device.equals("Tablet")) deviceFee = 10;
        else if (device.equals("Hotspot")) deviceFee = 20;

        double total = baseCost + dataOver + callOver + intlFee + deviceFee;

        String category;
        if (plan.contains("Basic")) category = "Budget";
        else if (plan.contains("Standard")) category = "Standard";
        else if (plan.contains("Premium")) category = "Premium";
        else category = "Unlimited";

        double savings = 0;
        if (plan.equals("Standard 5GB") && dataGB > 5) savings = 5;

        System.out.println("Data Usage: " + dataGB + " GB");
        System.out.println("Call Minutes: " + minutes + " minutes");
        System.out.println("International Usage: " + intl);
        System.out.println("Device Type: " + device);
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Base Plan Cost: $" + baseCost);
        System.out.println("Data Overage: $" + dataOver);
        System.out.println("Call Overage: $" + callOver);
        System.out.println("International Fee: $" + intlFee);
        System.out.println("Device Fee: $" + deviceFee);
        System.out.println("Total Monthly Cost: $" + total);
        System.out.println("Potential Savings: $" + savings);
        System.out.println("Plan Category: " + category);
    }
}