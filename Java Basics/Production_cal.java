import java.util.Scanner;
public class Production_cal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int rodsPerHour = sc.nextInt();
        int hoursWorked = sc.nextInt();
        int overtimeRods = sc.nextInt();
        int rejectedRods = sc.nextInt();

        int rods = (rodsPerHour * hoursWorked )+ overtimeRods - rejectedRods;
        System.out.println("Usable Rods = "+rods);
    }
}