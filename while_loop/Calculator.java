import java.util.Scanner;
class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int sum = 0; 
        int count = 0;
        int num;

        while(true){
            System.out.print("Enter number (0 to stop):");
            num = sc.nextInt();

            if(num == 0){
                break;
            }
            sum += num;
            count++;
        }
        System.out.println("Total sum: "+sum);
        System.out.println("Count: "+count);
    }
}