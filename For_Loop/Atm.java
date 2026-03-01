import java.util.Scanner;
class Atm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        int N = sc.nextInt();

        int success = 0;
        int failed = 0;
        double totalWithdrawn = 0;

        for (int i = 1; i <= N; i++) {
            double amount = sc.nextDouble();

            System.out.println("Transaction " + i + ": $" + amount);

            if (amount <= balance) {
                balance -= amount;
                totalWithdrawn += amount;
                success++;

                System.out.println("Status: Approved");
                System.out.println("Remaining Balance: $" + balance);
            } else {
                failed++;

                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
                System.out.println("Remaining Balance: $" + balance);
            }

            if (i != N)
                System.out.println();
        }

        System.out.println();
        System.out.println("Total Transactions: " + N);
        System.out.println("Successful Withdrawals: " + success);
        System.out.println("Failed Withdrawals: " + failed);
        System.out.println("Final Balance: $" + balance);
        System.out.println("Total Withdrawn: $" + totalWithdrawn);
    }
}