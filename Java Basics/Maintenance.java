import java.util.Scanner;
public class Maintenance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int MaintenanceCollection = sc.nextInt();
        int parkingFees = sc.nextInt();
        int hallBooking = sc.nextInt();
        int securitySalary = sc.nextInt();
        int electricityBill = sc.nextInt();
        int cleaningCost = sc.nextInt();

        int balance = MaintenanceCollection + parkingFees + hallBooking - securitySalary - electricityBill - cleaningCost;
        System.out.println("Remaining Balance = "+balance);
    }
}