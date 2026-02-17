import java.util.Scanner;
public class Purchase{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cred_limit = sc.nextInt();
        int pur_amt = sc.nextInt();
        int card_block = sc.nextInt();
        
        if(pur_amt <= cred_limit){
            if(card_block == 0){
                System.out.println("Approved");
            }else{
                System.out.println("Declined");
            }
        }
    }
}
