import java.util.Scanner;
public class Subscription20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int storageGB = sc.nextInt();
        int users = sc.nextInt();
        sc.nextLine();
        String backup = sc.nextLine();
        String support = sc.nextLine();

        double storageCost = 0;

        if (storageGB <= 100) {
            storageCost = storageGB * 0.05;
        } else if (storageGB <= 500) {
            storageCost = (100 * 0.05) + (storageGB - 100) * 0.04;
        } else if (storageGB <= 2000) {
            storageCost = (100 * 0.05) + (400 * 0.04) + (storageGB - 500) * 0.03;
        } else {
            storageCost = (100 * 0.05) + (400 * 0.04) + (1500 * 0.03) + (storageGB - 2000) * 0.02;
        }

        double userFee;
        if (users <= 10) userFee = users * 5;
        else if (users <= 50) userFee = users * 4;
        else userFee = users * 3;

        double backupFee = 0;
        if (backup.equals("Hourly")) {
            backupFee = 15 + 0.5 * users;
        } else if (backup.equals("Real-Time")) {
            backupFee = 50 + 1 * users;
        }

        double supportFee = 0;
        if (support.equals("Standard")) supportFee = 20;
        else if (support.equals("Priority")) supportFee = 75;
        else if (support.equals("Enterprise")) supportFee = 200;

        double monthly = storageCost + userFee + backupFee + supportFee;
        double annual = monthly * 12 * 0.9;

        String plan;
        String features;

        if (users == 1) {
            plan = "Personal";
            features = "Basic storage, file sync";
        } else if (users <= 20) {
            plan = "Team";
            features = "Version history, file sharing, basic analytics";
        } else if (users <= 100) {
            plan = "Business";
            features = "Advanced sharing, team analytics, priority support";
        } else {
            plan = "Enterprise";
            features = "Advanced security, compliance tools, dedicated support, API access";
        }

        System.out.println("Storage Capacity: " + storageGB + " GB");
        System.out.println("User Count: " + users);
        System.out.println("Backup Frequency: " + backup);
        System.out.println("Support Tier: " + support);
        System.out.println("Base Storage Cost: $" + storageCost);
        System.out.println("Per-User Fee: $" + userFee);
        System.out.println("Backup Premium: $" + backupFee);
        System.out.println("Support Fee: $" + supportFee);
        System.out.println("Monthly Subscription: $" + monthly);
        System.out.println("Annual Subscription: $" + annual + " (save 10%)");
        System.out.println("Recommended Plan: " + plan);
        System.out.println("Included Features: " + features);
    }
}