import java.util.Scanner;
class FlightAnalysis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] delays = new int[n];

        for(int i = 0; i < n; i++){
            delays[i] = sc.nextInt();
        }
        double sum = 0.0;
        int maxDelay = Integer.MIN_VALUE;
        int onTimeCount = 0;
        int compensationCount = 0;
        for(int i = 0; i < n; i++){
            sum += delays[i];
            if(delays[i] > maxDelay){
                maxDelay = delays[i];
            }
            if(delays[i] <= 15){
                onTimeCount++;
            }
            if(delays[i] > 180){
                compensationCount++;
            }
        }

        double average = sum / n;
        double onTimePerformance = ((double) onTimeCount / n) * 100;

        System.out.println("Total Flights: " + n);
        System.out.printf("Average Delay: %.2f minutes%n", average);
        System.out.println("Maximum Delay: " + maxDelay + " minutes");
        System.out.println("On-Time Flights: " + onTimeCount);
        System.out.println("Compensation Required: " + compensationCount);
        System.out.printf("On-Time Performance: %.2f%%%n", onTimePerformance);
    }
}