import java.util.Scanner;
public class Book{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int copies = sc.nextInt();
        int costPerCopy = sc.nextInt();
        int editCharge = sc.nextInt();
        int designCharge = sc.nextInt();
        int distributor = sc.nextInt();
        int marketingExpense = sc.nextInt();

        int profit = (copies * costPerCopy) + editCharge + designCharge - distributor - marketingExpense;
        System.out.println("Publishing profit = "+profit);
    }
}