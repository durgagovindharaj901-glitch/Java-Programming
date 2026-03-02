import java.util.Scanner;
class Bank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine(); 

        double totalDeposits = 0;
        double totalWithdrawals = 0;
        double totalTransfers = 0;
        double totalPayments = 0;

        for (int i = 1; i <= N; i++) {
            String transactionType = sc.next();
            double amount = sc.nextDouble();

            String category;
            switch (transactionType) {
                case "Deposit":
                    category = "Credit";
                    totalDeposits += amount;
                    break;
                case "Withdrawal":
                    category = "Debit";
                    totalWithdrawals += amount;
                    break;
                case "Transfer":
                    category = "Debit";
                    totalTransfers += amount;
                    break;
                case "Payment":
                    category = "Debit";
                    totalPayments += amount;
                    break;
                default:
                    category = "Unknown";
            }

            System.out.println("Transaction " + i + ": " + transactionType);
            System.out.println("Amount: $" + amount);
            System.out.println("Category: " + category);
            System.out.println();
        }

        double netBalanceChange = totalDeposits - (totalWithdrawals + totalTransfers + totalPayments);

        System.out.println("Total Transactions: " + N);
        System.out.println("Total Deposits: $" + totalDeposits);
        System.out.println("Total Withdrawals: $" + totalWithdrawals);
        System.out.println("Total Transfers: $" + totalTransfers);
        System.out.println("Total Payments: $" + totalPayments);
        System.out.println("Net Balance Change: $" + netBalanceChange);
    }
}
