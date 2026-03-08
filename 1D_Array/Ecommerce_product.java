import java.util.Scanner;
class Ecommerce_product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] prices = new double[n];
        for(int i = 0; i < n; i++){
            prices[i] = sc.nextDouble();
        }
        double min = prices[0];
        double max = prices[0];
        for(int i = 0; i < n; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            if(prices[i] > max){
                max = prices[i];
            }
        }
        double difference = max - min;
        double savingsPercentage = (difference / max) * 100;
        System.out.printf("Total Sellers: %d%n", n);
        System.out.printf("Maximum Price: %.2f%n", max);
        System.out.printf("Minimum Price: %.2f%n", min);
        System.out.printf("Price Difference: %.2f%n", difference);
        System.out.printf("Savings Percentage: %.2f%%%n", savingsPercentage);
    }
}