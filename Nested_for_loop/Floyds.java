import java.util.Scanner;
class Floyds{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num = 1; 
        for(int i = 1; i <= rows; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num);
                if(j < i) { 
                    System.out.print(" ");
                }

                num++; 
            }
            System.out.println(); 
        }

    }
}