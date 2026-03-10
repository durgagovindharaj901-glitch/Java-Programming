import java.util.Scanner;
class EstateValuation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] values = new double[n];
        for(int i = 0; i < n; i++){
            values[i] = sc.nextDouble();
        }
        double totalValue = 0;
        double maxValue = Double.MIN_VALUE;
        double minValue = Double.MAX_VALUE;
        int maxIndex = -1;
        int minIndex = -1;
        for(int i = 0; i < n; i++){
            double val = values[i];
            totalValue += val;

            if(val > maxValue){
                maxValue = val;
                maxIndex = i + 1; 
            }
            if(val < minValue){
                minValue = val;
                minIndex = i + 1;
            }
        }
        double avgValue = totalValue / n;
        double bargainThreshold = avgValue * 0.7;
        double premiumThreshold = avgValue * 1.5;
        int bargainCount = 0;
        int premiumCount = 0;
        for(int i = 0; i < n; i++){
            if(values[i] < bargainThreshold){
                bargainCount++;
            }
            if(values[i] > premiumThreshold){
                premiumCount++;
            }
        }

        System.out.println("Total Properties: " + n);
        System.out.printf("Portfolio Value: $%.2f%n", totalValue);
        System.out.printf("Average Property Value: $%.2f%n", avgValue);
        System.out.printf("Most Valuable: $%.2f (Property %d)%n", maxValue, maxIndex);
        System.out.printf("Least Valuable: $%.2f (Property %d)%n", minValue, minIndex);
        System.out.println("Bargain Properties (<70% avg): " + bargainCount);
        System.out.println("Premium Properties (>150% avg): " + premiumCount);
    }
}