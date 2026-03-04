import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev = 0;
        int temp = n;
        int i = 0;
        while(n!=0){
            int id = n % 10;
            rev = (rev * 10) + id;
            n = n/10;
            i++;
        }
        if(temp == rev){
            System.out.printf("%d is a palindrome",temp);
        }else{
            System.out.printf("%d is not a palindrome",temp);
        }
    }
}