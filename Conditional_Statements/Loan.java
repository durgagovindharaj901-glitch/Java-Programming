import java.util.Scanner;
public class Loan{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Credit Score:");
        int creditScore = sc.nextInt();
        System.out.println("Annual Income:");
        double annual_income = sc.nextDouble();
        System.out.println("Debt-to-Income Ratio:");
        double debtToIncomeRatio = sc.nextDouble();
        System.out.println("Loan Type ? (H : P : B): ");
        char str = sc.next().charAt(0);
        double amount;
        if( creditScore < 600 && debtToIncomeRatio > 50){
            System.out.println("Rejected");
        }
        else if(str == 'H'){
            if(creditScore >= 750 && debtToIncomeRatio <= 30){
                amount = 4 * annual_income;
                System.out.println("Approved");
                System.out.println("Maximum Loan Amount:"+amount);
            }else if(creditScore >= 700 && creditScore < 750){
                if(debtToIncomeRatio >= 31 && debtToIncomeRatio <= 40){
                    amount = 3 * annual_income;
                    System.out.println("Needs Review");
                    System.out.println("Maximum Loan Amount:"+amount);
                }
            }
                
        }
        else if(str == 'P'){
            if(creditScore >= 750 && debtToIncomeRatio <= 30){
                amount = 1 * annual_income;
                System.out.println("Approved");
                System.out.println("Maximum Loan Amount:"+amount);

            }else if(creditScore >= 650 && creditScore < 700){
                if(debtToIncomeRatio >= 31 && debtToIncomeRatio <= 40){
                    amount = 0.5 * annual_income;
                    System.out.println("Needs Review");
                    System.out.println("Maximum Loan Amount:"+amount);
                }
            }
        }else{
            if(creditScore >= 750 && debtToIncomeRatio <= 30){
                amount = 3 * annual_income;
                System.out.println("Approved");
                System.out.println("Maximum Loan Amount:"+amount);
            }
            else if(creditScore >= 700 && creditScore < 750){
                if(debtToIncomeRatio >= 31 && debtToIncomeRatio <= 40){
                    amount = 3 * annual_income;
                    System.out.println("Approved");
                    System.out.println("Maximum Loan Amount:"+amount);
                }
            }
        }
    }
}