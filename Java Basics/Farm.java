import java.util.Scanner;
public class Farm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int yieldPerArea = sc.nextInt();
        int acres = sc.nextInt();
        int extrafield = sc.nextInt();
        int damagesCrops = sc.nextInt();

        int yield = (yieldPerArea * acres )+ extrafield - damagesCrops;
        System.out.println("FINAL YIELD = "+yield);
    }
}