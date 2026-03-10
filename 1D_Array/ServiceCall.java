import java.util.Scanner;
class ServiceCall{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] times = new int[n];
        for(int i = 0; i < n; i++){
            times[i] = sc.nextInt();
        }

        double sum = 0.0;
        int minTime = Integer.MAX_VALUE;
        int maxTime = Integer.MIN_VALUE;
        int exceedingCount = 0;
        for(int i = 0; i < n; i++){
            sum += times[i];
            if(times[i] < minTime){
                minTime = times[i];
            }
            if(times[i] > maxTime){
                maxTime = times[i];
            }
            if(times[i] > 300){
                exceedingCount++;
            }
        }

        double average = sum / n;
        double compliance = ((double)(n - exceedingCount) / n) * 100;

        System.out.println("Total Calls: " + n);
        System.out.printf("Average Handling Time: %.2f seconds%n", average);
        System.out.println("Shortest Call: " + minTime + " seconds");
        System.out.println("Longest Call: " + maxTime + " seconds");
        System.out.println("Calls Exceeding Target (300s): " + exceedingCount);
        System.out.printf("Target Compliance: %.2f%%%n", compliance);
    }
}