import java.util.Scanner;
public class Project{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int developerHours = sc.nextInt();
        int hourlyRate = sc.nextInt();
        int designCost = sc.nextInt();
        int testingCost = sc.nextInt();
        int advancePaid = sc.nextInt();

        int cost = (developerHours * hourlyRate) + designCost + testingCost - advancePaid;
        System.out.println("Final Project Cost = "+cost);
    }
}