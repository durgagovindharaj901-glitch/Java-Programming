import java.util.Scanner;
class Ticket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double originalTotal = 0;
        double finalTotal = 0;

        for (int i = 1; i <= N; i++) {
            String seat = sc.next();
            String customer = sc.next();

            double base = 0;
            if (seat.equals("Regular")) base = 12;
            else if (seat.equals("Premium")) base = 18;
            else base = 25;

            int discount = 0;
            if (customer.equals("Child")) discount = 30;
            else if (customer.equals("Senior")) discount = 25;

            double finalPrice = base * (1 - discount / 100.0);

            originalTotal += base;
            finalTotal += finalPrice;

            System.out.println("Ticket " + i + ": " + seat + " - " + customer);
            System.out.println("Base Price: $" + base);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + finalPrice);
        }

        boolean group = false;
        if (N >= 5) {
            finalTotal *= 0.9;
            group = true;
        }

        double totalDiscount = originalTotal - finalTotal;

        System.out.println();
        System.out.println("Total Tickets: " + N);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.println("Group Discount Applied: " + (group ? "Yes" : "No"));
    }
}