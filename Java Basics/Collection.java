import java.util.Scanner;
public class Collection{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int ticketRevenue = sc.nextInt();
        int snackRevenue = sc.nextInt();
        int maintenanceCost = sc.nextInt();
        int electricityBill = sc.nextInt();

        int value = ticketRevenue + snackRevenue - maintenanceCost - electricityBill;
        System.out.println("Net profit = "+value);
    }
}