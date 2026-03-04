import java.util.Scanner;
class BitiDeci{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int binary = scan.nextInt();
        int temp = binary;
        int decimal = 0;
        int power = 0;

        while(binary > 0){
            int digit = binary % 10;
            decimal = decimal + digit * (int)Math.pow(2, power);
            power++;
            binary = binary / 10;
        }

        System.out.println("Binary: " + temp);
        System.out.println("Decimal: " + decimal);
    }
}