import java.util.Scanner;
class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int totalItems = 0;
        double originalTotal = 0;
        double finalTotal = 0;

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            int discount;
            if (qty == 1) discount = 0;
            else if (qty <= 4) discount = 10;
            else if (qty <= 9) discount = 15;
            else discount = 20;

            double subtotal = price * qty * (1 - discount / 100.0);
            double original = price * qty;

            totalItems += qty;
            originalTotal += original;
            finalTotal += subtotal;

            System.out.println("Product: " + name);
            System.out.println("Unit Price: $" + price);
            System.out.println("Quantity: " + qty);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Subtotal: $" + subtotal);

            if (i != N - 1)
                System.out.println();
        }

        double totalDiscount = originalTotal - finalTotal;
        double savings = (totalDiscount / originalTotal) * 100;

        System.out.println();
        System.out.println("Total Items: " + totalItems);
        System.out.println("Original Total: $" + originalTotal);
        System.out.println("Total Discount: $" + totalDiscount);
        System.out.println("Final Total: $" + finalTotal);
        System.out.printf("Savings: %.2f%%\n", savings);
    }
}