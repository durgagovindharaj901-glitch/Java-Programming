import java.util.Scanner;
public class Login{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        int pass = sc.nextInt();
        int acc_lock = sc.nextInt();
    
        if(user == 1 && pass == 1 && acc_lock == 0){
            System.out.println("Success");
        }else{
            System.out.println("Failed");
        }
    }
}