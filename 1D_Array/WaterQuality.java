import java.util.Scanner;
import java.util.ArrayList;
class WaterQuality{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] phValues = new double[n];

        for(int i = 0; i < n; i++){
            phValues[i] = sc.nextDouble();
        }

        double sum = 0.0;
        double minPH = Double.MAX_VALUE;
        double maxPH = Double.MIN_VALUE;
        int unsafeCount = 0;
        ArrayList<Integer> criticalAlerts = new ArrayList<>();
        for(int i = 0; i < n; i++){
            double ph = phValues[i];
            sum += ph;
            if(ph < minPH){
                minPH = ph;
            }
            if(ph > maxPH){
                maxPH = ph;
            }
            if(ph < 6.5 || ph > 8.5){
                unsafeCount++;
                criticalAlerts.add(i + 1); 
            }
        }

        double average = sum / n;
        double compliance = ((double)(n - unsafeCount) / n) * 100;
        System.out.println("Total Samples: " + n);
        System.out.printf("Average pH: %.2f%n", average);
        System.out.printf("Minimum pH: %.2f%n", minPH);
        System.out.printf("Maximum pH: %.2f%n", maxPH);
        System.out.println("Unsafe Samples: " + unsafeCount);
        System.out.printf("Safety Compliance: %.2f%%%n", compliance);
        System.out.println("Critical Alerts: " + criticalAlerts);
    }
}