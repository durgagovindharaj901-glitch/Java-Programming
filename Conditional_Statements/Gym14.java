import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String tier = sc.nextLine();
        int months = sc.nextInt();
        sc.nextLine();
        String access = sc.nextLine();
        String addOn = sc.nextLine();

        double base = 0;
        double discount = 0;
        double accessFee = 0;
        double addFee = 0;

        if (tier.equals("Basic")){
            base = 40;
        }else if (tier.equals("Premium")){
            base = 80;
        } 
        else if (tier.equals("Elite")) {
        base = 120;
        }else {
            base = 150;
        }
        if (months == 6) {
            discount = 10;
        }else if (months == 12) {
            discount = 15;
        }else if (months == 24) {
            discount = 25;
        }
        if (access.equals("Regional")) {
            accessFee = 20;
        }else if (access.equals("Nationwide")) {
            accessFee = 50;
        }
        if (addOn.equals("Personal-Training")) {
            addFee = 100;
        }else if (addOn.equals("Classes")) {
            addFee = 50;
        }else if (addOn.equals("Full-Package")) {
            addFee = 200;
        }
        double discountedBase = base * (1 - discount / 100);
        double monthly = discountedBase + accessFee + addFee;
        double contractTotal = monthly * months;
        double savings = (base + accessFee + addFee) * months - contractTotal;

        String category;
        if (tier.equals("Basic")) {
            category = "Budget";
        }else if (tier.equals("Premium") && monthly < 120) {
            category = "Standard";
        }else if (tier.equals("Premium") || tier.equals("Elite")) {
            category = "Premium";
        }else {
            category = "Luxury";
        }
        System.out.println("Membership Tier: " + tier);
        System.out.println("Contract Length: " + months + " months");
        System.out.println("Access Level: " + access);
        System.out.println("Add-Ons: " + addOn);
        System.out.println("Base Monthly Fee: $" + base);
        System.out.println("Contract Discount: " + discount + "%");
        System.out.println("Access Fee: $" + accessFee);
        System.out.println("Add-On Fee: $" + addFee);
        System.out.println("Monthly Total: $" + monthly);
        System.out.println("Contract Total: $" + contractTotal);
        System.out.println("Savings vs Month-to-Month: $" + savings);
        System.out.println("Membership Category: " + category);
    }
}
    