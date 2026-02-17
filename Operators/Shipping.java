import java.util.Scanner;
public class Shipping{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cart_val = sc.nextInt();
        int prem_mem = sc.nextInt();
        
        if(cart_val > 999 || prem_mem == 1){
            System.out.println("Free Shipping");
        }else{
            System.out.println("Charges Applied");
        }
    }
}