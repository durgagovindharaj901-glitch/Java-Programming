import java.util.Scanner;
class Power{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result = 1;
        int expo = exponent;
        while(exponent > 0){
            result = result * base;
            exponent--;
        }
        System.out.printf("%d ^ %d = %d",base,expo,result);
    }
}