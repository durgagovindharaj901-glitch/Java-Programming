import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int users = sc.nextInt();
        sc.nextLine();
        String license = sc.nextLine();
        String support = sc.nextLine();
        int years = sc.nextInt();

        double base = 0;
        double volumeDisc = 0;
        double supportFee = 0;
        double yearDisc = 0;

        if (license.equals("Standard")){
            base = 60;
        }else if(license.equals("Professional")){
            base = 120;
        }else{
            base = 200;
        }
        if(users <= 50){
            volumeDisc = 0;
        }else if(users <= 200){
            volumeDisc = 15;
        }else if(users <= 500){
            volumeDisc = 20;
        }else if(users <= 1000){
            volumeDisc = 25;
        }else {
            volumeDisc = 35;
        }
        if (support.equals("Basic")) {
            supportFee = 10;
        }else if (support.equals("Priority")) {
            supportFee = 30;
        }else {
            supportFee = 80;
        }
        if (years == 2) {
            yearDisc = 5;
        }else if (years == 3) {
            yearDisc = 10;
        }else if (years == 5) {
            yearDisc = 20;
        }
        double discountedBase = base * (1 - volumeDisc / 100);
        double annualPerUser = (discountedBase + supportFee) * (1 - yearDisc / 100);
        double totalAnnual = annualPerUser * users;
        double contractValue = totalAnnual * years;

        String tier;
        if (users < 200){
            tier = "Small Business";
        }else if (users <= 1000){
            tier = "Mid-Market";
        }else {
            tier = "Enterprise";
        }
        System.out.println("User Count: " + users);
        System.out.println("License Type: " + license);
        System.out.println("Support Level: " + support);
        System.out.println("Contract Duration: " + years + " years");
        System.out.println("Base Price Per User: $" + base);
        System.out.println("Volume Discount: " + volumeDisc + "%");
        System.out.println("Support Fee Per User: $" + supportFee);
        System.out.println("Multi-Year Discount: " + yearDisc + "%");
        System.out.println("Annual Cost Per User: $" + annualPerUser);
        System.out.println("Total Annual Cost: $" + totalAnnual);
        System.out.println("Total Contract Value: $" + contractValue);
        System.out.println("Pricing Tier: " + tier);
    }
}
    