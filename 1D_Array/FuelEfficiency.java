import java.util.Scanner;

public class FleetEfficiency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] mpg = new double[n];
        double total = 0.0;

        System.out.println("Enter fuel efficiency (MPG) for each vehicle:");
        for (int i = 0; i < n; i++) {
            mpg[i] = sc.nextDouble();
            total += mpg[i];
        }
        double average = total / n;
        double max = mpg[0], min = mpg[0];
        int maxIndex = 1, minIndex = 1;
        for (int i = 1; i < n; i++) {
            if (mpg[i] > max) {
                max = mpg[i];
                maxIndex = i + 1; 
            }
            if (mpg[i] < min) {
                min = mpg[i];
                minIndex = i + 1;
            }
        }

        double threshold = average * 0.8;
        int count = 0;
        StringBuilder maintenanceList = new StringBuilder("[");
        for (int i = 0; i < n; i++) {
            if (mpg[i] < threshold) {
                count++;
                maintenanceList.append(i + 1).append(", ");
            }
        }
        if (count > 0) {
            maintenanceList.setLength(maintenanceList.length() - 2);
        }
        maintenanceList.append("]");

        System.out.println("\nFleet Size: " + n);
        System.out.printf("Average Fuel Efficiency: %.2f MPG%n", average);
        System.out.printf("Most Efficient: %.2f MPG (Vehicle %d)%n", max, maxIndex);
        System.out.printf("Least Efficient: %.2f MPG (Vehicle %d)%n", min, minIndex);
        System.out.println("Underperforming Vehicles: " + count);
        System.out.printf("Efficiency Threshold: %.2f MPG%n", threshold);
        System.out.println("Maintenance Priority: " + maintenanceList);
    }
}