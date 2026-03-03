import java.util.Scanner;
class Reverse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int i = 0;
        int rev = 0;
        while(i < n){
            int id = n % 10;
            rev = (rev * 10) + id;
            n = n / 10;
        }
        System.out.println("Original : "+temp);
        System.out.println("Reversed : "+rev);
    }
}