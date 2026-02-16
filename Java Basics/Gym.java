import java.util.Scanner;
public class Gym{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int basesalary = sc.nextInt();
        int sessions = sc.nextInt();
        int payperSession = sc.nextInt();
        int bonus = sc.nextInt();
        int maintenanceFee = sc.nextInt();

        int salary = basesalary + (sessions * payperSession) + bonus - maintenanceFee;
        System.out.println("Final Salary = "+salary);
    }
}