import java.util.Scanner;
class EnergyConsumption{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] consumption = new double[n];

        for(int i = 0; i < n; i++){
            consumption[i] = sc.nextDouble();
        }
        double dailyLimit = sc.nextDouble();

        double total = 0.0;
        double maxValue = Double.MIN_VALUE;
        int peakHour = -1;

        for(int i = 0; i < n; i++){
            total += consumption[i];
            if(consumption[i] > maxValue){
                maxValue = consumption[i];
                peakHour = i + 1; 
            }
        }
        double average = total / n;
        System.out.println("Hours Monitored: " + n);
        System.out.printf("Total Daily Consumption: %.2f kWh%n", total);
        System.out.printf("Peak Hour: Hour %d (%.2f kWh)%n", peakHour, maxValue);
        System.out.printf("Average Hourly: %.2f kWh%n", average);
        System.out.printf("Daily Limit: %.2f kWh%n", dailyLimit);

        if(total <= dailyLimit){
            System.out.println("Status: Within Limit");
        }else{
            System.out.printf("Status: Exceeded Limit by %.2f kWh%n", (total - dailyLimit));
        }
    }
}