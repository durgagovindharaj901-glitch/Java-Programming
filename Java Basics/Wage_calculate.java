import java.util.Scanner;
public class Wage_calculate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int daysWorked = sc.nextInt();
        int WagePerday = sc.nextInt();
        int overtimeBonus = sc.nextInt();
        int maintenanceCharge = sc.nextInt();

        int base = daysWorked * WagePerday;
        int add_bonus = base + overtimeBonus;
        int wages = add_bonus - maintenanceCharge;
        System.out.println("Final Weekly Wage = "+wages);
    }
}