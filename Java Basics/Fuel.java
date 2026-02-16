import java.util.Scanner;
public class Fuel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int mileage = sc.nextInt();
        int price = sc.nextInt();
        int toll_charge = sc.nextInt();

        int cost = (distance / mileage * price )+ toll_charge;
        System.out.println("Total Trip Cost = "+cost);


    }
}