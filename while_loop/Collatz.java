import java.util.Scanner;
class Collatz{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int steps = 0;
        int temp = n;

        System.out.println("Collatz sequence starting from " + n + ":");

        if(n == 1){
            System.out.println("1");
            System.out.println("Steps: 0");
            return;
        }

        do{
            System.out.print(n + " ");
            
            if(n % 2 == 0){
                n = n / 2;
            }else{
                n = 3 * n + 1;
            }
            
            steps++;
            
        }while(n != 1);

        System.out.println("1");
        System.out.println("Steps: " + steps);
    }
}