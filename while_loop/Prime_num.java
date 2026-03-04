import java.util.Scanner;
class Prime_num{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = 0;
        int i = 2;
        while(i < n/2){
            if(n%i==0){
                temp = 1;
                break;
            }
            i++;
            
        }if(n > 1 && temp == 0){
            System.out.println(n+" is prime");
        }else{
            System.out.println(n+" is not prime");
        }
    }
}