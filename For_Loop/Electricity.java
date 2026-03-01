import java.util.Scanner;
class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int totalUnits = 0;
        double totalRevenue = 0;

        for (int i = 0; i < N; i++) {
            String id = sc.next();
            int units = sc.nextInt();

            double bill = 0;

            if (units <= 100)
                bill = units * 0.10;
            else if (units <= 200)
                bill = 100 * 0.10 + (units - 100) * 0.13;
            else if (units <= 300)
                bill = 100 * 0.10 + 100 * 0.13 + (units - 200) * 0.16;
            else
                bill = 100 * 0.10 + 100 * 0.13 + 100 * 0.16 + (units - 300) * 0.20;

            String category;
            if (units <= 200)
                category = "Low Usage";
            else if (units <= 300)
                category = "Medium Usage";
            else
                category = "High Usage";

            totalUnits += units;
            totalRevenue += bill;

            System.out.println("Consumer ID: " + id);
            System.out.println("Units Consumed: " + units);
            System.out.println("Bill Amount: $" + bill);
            System.out.println("Category: " + category);

            if (i != N - 1)
                System.out.println();
        }

        double avgBill = totalRevenue / N;

        System.out.println();
        System.out.println("Total Consumers: " + N);
        System.out.println("Total Units Consumed: " + totalUnits);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Bill: %.2f\n", avgBill);
    }
}