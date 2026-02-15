import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int tutionFees = sc.nextInt();
        int scholarship = sc.nextInt();
        int examFee = sc.nextInt();
        int libraryFee = sc.nextInt();

        int scholar = (tutionFees * scholarship)/100;
        int total = tutionFees - scholar + examFee + libraryFee;
        System.out.println("Final Payable Fee = "+ total);
    }
}
