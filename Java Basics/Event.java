import java.util.Scanner;
public class Event{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int registration = sc.nextInt();
        int sponsor = sc.nextInt();
        int stallRent = sc.nextInt();
        int stageCost = sc.nextInt();
        int celebrityCost = sc.nextInt();
        int marketingCost = sc.nextInt();

        int fund = registration + sponsor + stallRent - stageCost - celebrityCost - marketingCost;
        System.out.println("Remaining Fund = "+fund);
    }
}