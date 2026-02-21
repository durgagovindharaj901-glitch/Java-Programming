import java.util.Scanner;
public class Reward17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String tier = sc.nextLine();
        String category = sc.nextLine();
        double amount = sc.nextDouble();
        sc.nextLine();
        String promo = sc.nextLine();

        double baseRate = 1.0;
        double categoryBonus = 1.0;
        double tierMultiplier = 1.0;
        double promoMultiplier = 1.0;
        String rewardsTier = "Standard";

        if(category.equals("Groceries"))categoryBonus = 2.0;
        else if(category.equals("Dining")) categoryBonus = 2.5;
        else if(category.equals("Travel")) categoryBonus = 3.0;
        else if(category.equals("Gas")) categoryBonus = 2.0;

        if(tier.equals("Gold")){ 
            tierMultiplier = 1.25; rewardsTier = "Enhanced"; 
        }
        else if(tier.equals("Platinum")){ 
            tierMultiplier = 1.5; rewardsTier = "Premium"; 
        }
        else if(tier.equals("Black")){ 
            tierMultiplier = 2.0; rewardsTier = "Elite"; 
        }

        if (promo.equals("Double-Points")) promoMultiplier = 2.0;
        else if (promo.equals("Triple-Points")) promoMultiplier = 3.0;

        double points = amount * baseRate * categoryBonus * tierMultiplier * promoMultiplier;
        double cashValue = points * 0.01;

        System.out.println("Card Tier: " + tier);
        System.out.println("Purchase Category: " + category);
        System.out.println("Transaction Amount: $" + amount);
        System.out.println("Promotional Status: " + promo);
        System.out.println("Base Points Rate: " + baseRate + " points per dollar");
        System.out.println("Category Bonus: " + categoryBonus + "x");
        System.out.println("Tier Multiplier: " + tierMultiplier + "x");
        System.out.println("Promotional Multiplier: " + promoMultiplier + "x");
        System.out.println("Points Earned: " + points);
        System.out.println("Equivalent Cash Value: $" + cashValue);
        System.out.println("Rewards Tier: " + rewardsTier);
    }
}
    