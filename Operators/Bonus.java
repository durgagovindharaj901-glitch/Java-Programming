import java.util.Scanner;
public class Bonus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int work_hr = sc.nextInt();
        int att_per = sc.nextInt();
        
        if(work_hr >= 40 && att_per >= 90){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }
    }
}