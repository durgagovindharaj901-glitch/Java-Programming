import java.util.Scanner;
class Restaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int totalItems = 0;
        double subtotal = 0;

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            int qty = sc.nextInt();

            double itemTotal = price * qty;

            totalItems += qty;
            subtotal += itemTotal;

            System.out.println("Item: " + name);
            System.out.println("Price: $" + price + " x " + qty);
            System.out.println("Subtotal: $" + itemTotal);

            if (i != N - 1)
                System.out.println();
        }

        double tax = subtotal * 0.08;
        double service = subtotal * 0.10;
        double grand = subtotal + tax + service;

        System.out.println();
        System.out.println("Total Items: " + totalItems);
        System.out.println("Subtotal: $" + subtotal);
        System.out.printf("Tax (8%%): $%.2f\n", tax);
        System.out.printf("Service Charge (10%%): $%.2f\n", service);
        System.out.printf("Grand Total: $%.2f\n", grand);

    }
}