import java.util.Scanner;
class Fibbonacci{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int first = 0;
        int second = 1;
        System.out.printf("Fibonacci sequence (%d terms): \n",n);
        int i = 0;
        while(i < n){
            System.out.print(first + " ");
            int temp = first;
            first = first + second;
            second = temp;
            i++; 
        }
    }
}