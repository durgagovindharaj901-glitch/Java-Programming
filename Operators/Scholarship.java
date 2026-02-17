import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fam_inc = sc.nextInt();
        int per = sc.nextInt();
        
        if(fam_inc < 200000 && per >= 75){
            System.out.println("Scholarship Granted");
        }else{
            System.out.println("Not Granted");
        }
    }
}