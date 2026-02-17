import java.util.Scanner;
public class Capacity{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int baseBoxes = sc.nextInt();
        int level = sc.nextInt();

        int power =1;
        for(int i = 0; i<level;i++){
            power = power * 2 ;
        }
        int capacity = baseBoxes * power;
        System.out.println("Total Capacity = "+capacity);
    }
}