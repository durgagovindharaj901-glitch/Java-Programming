import java.util.Scanner;
class CropYieldPrediction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] yields = new double[n];

        for(int i = 0; i < n; i++){
            yields[i] = sc.nextDouble();
        }

        double total = 0.0;
        double maxYield = Double.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0; i < n; i++){
            total += yields[i];
            if(yields[i] > maxYield){
                maxYield = yields[i];
                maxIndex = i + 1; 
            }
        }

        double average = total / n;
        double threshold = average * 0.8;
        int underperforming = 0;
        for(int i = 0; i < n; i++){
            if(yields[i] < threshold){
                underperforming++;
            }
        }

        System.out.println("Total Plots: " + n);
        System.out.printf("Total Harvest: %.2f tons%n", total);
        System.out.printf("Average Yield: %.2f tons/acre%n", average);
        System.out.printf("Highest Yield: %.2f tons/acre (Plot %d)%n", maxYield, maxIndex);
        System.out.println("Underperforming Plots: " + underperforming);
        System.out.printf("Performance Threshold: %.2f tons/acre%n", threshold);
    }
}