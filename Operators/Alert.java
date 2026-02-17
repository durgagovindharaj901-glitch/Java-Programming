import java.util.Scanner;
public class Alert{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int consumed = sc.nextInt();
        int vol = sc.nextInt();
    
        if(consumed > 500){
            if(vol == 0 || vol == 1)
            System.out.println("Alert");
        }else{
            System.out.println("Normal");
        }
    }
}