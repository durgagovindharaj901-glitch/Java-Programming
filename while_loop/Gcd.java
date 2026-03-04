import java.util.Scanner;
class Gcd{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int n1 = a;
        int n2 = b;
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.printf("GCD of %d and %d = %d",n1,n2,a);
    }
}