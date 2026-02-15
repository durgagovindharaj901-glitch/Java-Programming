import java.util.Scanner;
public class Mobile{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int baseCost = sc.nextInt();
        int extraGB = sc.nextInt();
        int ratePerGb = sc.nextInt();
        int tax = sc.nextInt();

        double total = baseCost + (extraGB*ratePerGb);
        double bill = total + (total * tax / 100);
        System.out.println("Total Bill = "+ bill);
    }
}