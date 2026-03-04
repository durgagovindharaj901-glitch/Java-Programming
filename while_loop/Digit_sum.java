import java.util.Scanner;
class Digit_sum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        System.out.println("Number : "+num);
        while (num!=0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        
        System.out.println("Sum of digits : "+sum);
    }
}