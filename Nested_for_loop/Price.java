import java.util.Scanner;
class Price{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int products = sc.nextInt();
        int vendors = sc.nextInt();
        sc.nextLine();

        String[] productNames = new String[products];
        double[][] prices = new double[products][vendors];

        for (int i = 0; i < products; i++) {
            productNames[i] = sc.nextLine();

            for (int j = 0; j < vendors; j++) {
                prices[i][j] = sc.nextDouble();
            }
            sc.nextLine();
        }
        System.out.printf("\n%-15s", "Product");
        for (int j = 0; j < vendors; j++) {
            System.out.printf("Vendor%-6d", j + 1);
        }
        System.out.printf("%-10s\n", "Best");

        for (int i = 0; i < products; i++) {

            System.out.printf("%-15s", productNames[i]);

            double minPrice = Double.MAX_VALUE;

            for (int j = 0; j < vendors; j++) {
                System.out.printf("%-10.2f", prices[i][j]);
                minPrice = Math.min(minPrice, prices[i][j]);

            }
            System.out.printf("%-10.2f\n", minPrice);
        }
    }
}