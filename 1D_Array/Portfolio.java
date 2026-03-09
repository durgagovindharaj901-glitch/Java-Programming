import java.util.Scanner;

class Portfolio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] quantities = new double[n];
        double[] prices = new double[n];
        double[] values = new double[n];

        double totalValue = 0.0;
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        int maxIndex = -1, minIndex = -1;

        for (int i = 0; i < n; i++) {
            quantities[i] = sc.nextDouble();
            prices[i] = sc.nextDouble();
            values[i] = quantities[i] * prices[i];
            totalValue += values[i];

            if (values[i] > maxValue) {
                maxValue = values[i];
                maxIndex = i;
            }
            if (values[i] < minValue) {
                minValue = values[i];
                minIndex = i;
            }
        }
        System.out.println("Number of Assets: " + n);
        System.out.printf("Total Portfolio Value: $%.2f%n", totalValue);
        System.out.printf("Most Valuable Asset: Asset %d ($%.2f)%n", maxIndex + 1, maxValue);
        System.out.printf("Least Valuable Asset: Asset %d ($%.2f)%n", minIndex + 1, minValue);
    }
}