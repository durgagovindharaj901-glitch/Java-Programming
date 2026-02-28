import java.util.Scanner;

class Stock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int lowStockItems = 0;
        int criticalItems = 0;
        double totalQuantity = 0;

        for (int i = 1; i <= N; i++) {
            String productName = sc.next();
            int currentStock = sc.nextInt();
            int minStock = sc.nextInt();

            String status;
            double quantity;

            if (currentStock >= minStock) {
                status = "Adequate";
                quantity = 0;
            } 
            else if (currentStock >= minStock / 2) {
                status = "Low Stock";
                quantity = (minStock - currentStock) + minStock / 2.0;
                lowStockItems++;
            } 
            else {
                status = "Critical";
                quantity = (minStock - currentStock) + minStock * 1.5;
                criticalItems++;
            }

            totalQuantity += quantity;

            System.out.println("Product: " + productName);
            System.out.println("Status: " + status);
            System.out.printf("Reorder Quantity: %.2f%n", quantity);
            System.out.println();
        }

        System.out.println("Total Products : "+N);
        System.out.println("Low Stock Items: " + lowStockItems);
        System.out.println("Critical Items: " + criticalItems);
        System.out.println("Total Reorder Quantity: "+ totalQuantity);

    }
}