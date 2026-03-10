import java.util.Scanner;
import java.util.ArrayList;
class Warehouse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sales = new int[n];
        for(int i = 0; i < n; i++){
            sales[i] = sc.nextInt();
        }

        int total = 0;
        int bestSeller = Integer.MIN_VALUE;
        int bestIndex = -1;

        for(int i = 0; i < n; i++){
            total += sales[i];
            if(sales[i] > bestSeller){
                bestSeller = sales[i];
                bestIndex = i + 1; 
            }
        }

        double average = (double) total / n;
        double threshold = average * 0.5;
        int slowMovingCount = 0;
        ArrayList<Integer> clearanceCandidates = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(sales[i] < threshold){
                slowMovingCount++;
                clearanceCandidates.add(i + 1); 
            }
        }
        System.out.println("Total Products: " + n);
        System.out.println("Total Units Sold: " + total);
        System.out.printf("Average Monthly Sales: %.2f", average);
        System.out.println("Best Seller: Product " + bestIndex);
        System.out.println("Slow-Moving Products: " + slowMovingCount);
        System.out.printf("Turnover Threshold: %.2f units", threshold);
        System.out.println("Clearance Candidates: " + clearanceCandidates);
    }
}