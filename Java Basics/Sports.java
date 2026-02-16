import java.util.Scanner;
public class Sports{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int teamReg = sc.nextInt();
        int broadcasting = sc.nextInt();
        int sponsor = sc.nextInt();
        int prize = sc.nextInt();
        int stadiumRent = sc.nextInt();
        int adCost = sc.nextInt();

        int fund = teamReg + broadcasting + sponsor - prize - stadiumRent - adCost;
        System.out.println("Remaining Tournament Fund = "+fund);
    }
}