import java.util.Scanner;
class Commission {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double totalSales = 0;
        double totalCommissions = 0;
        String topPerformer = "";
        double maxSales = 0;

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double sales = sc.nextDouble();

            double rate;
            double bonus = 0;

            
            if (sales < 50000){
                rate = 5;
            }else if (sales < 80000){
                rate = 8;
            }else if (sales < 100000){
                rate = 10;
            }else{
                rate = 12;
                bonus = 2000;
            }

            double commission = sales * rate / 100;
            double payout = commission + bonus;

            totalSales += sales;
            totalCommissions += payout;

            if (sales > maxSales) {
                maxSales = sales;
                topPerformer = name;
            }

            
            System.out.println("Sales Rep: " + name);
            System.out.println("Sales Amount: $" + sales);
            System.out.println("Commission Rate: " + (int)rate + "%");
            System.out.println("Commission Earned: $" + commission);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + payout);

            if (i != N - 1)
                System.out.println();
        }

        System.out.println();
        System.out.println("Total Sales Reps: " + N);
        System.out.println("Total Sales: $" + totalSales);
        System.out.println("Total Commissions: $" + totalCommissions);
        System.out.println("Top Performer: " + topPerformer);
    }
}