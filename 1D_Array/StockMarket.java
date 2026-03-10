import java.util.Scanner;
import java.util.ArrayList;
class StockMarket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] volumes = new int[n];
        for(int i = 0; i < n; i++){
            volumes[i] = sc.nextInt();
        }
        int total = 0;
        int peakVolume = Integer.MIN_VALUE;
        int peakDay = -1;
        for(int i = 0; i < n; i++){
            total += volumes[i];
            if(volumes[i] > peakVolume){
                peakVolume = volumes[i];
                peakDay = i + 1;
            }
        }

        double average = (double) total / n;
        double threshold = average * 1.5;
        int highVolumeCount = 0;
        ArrayList<Integer> breakoutDays = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(volumes[i] > threshold){
                highVolumeCount++;
                breakoutDays.add(i + 1); 
            }
        }
        System.out.println("Trading Days Analyzed: " + n);
        System.out.println("Total Volume: " + total);
        System.out.printf("Average Daily Volume: %.0f%n", average);
        System.out.println("Peak Volume Day: Day " + peakDay + " (" + peakVolume + ")");
        System.out.println("High Volume Days (>150% avg): " + highVolumeCount);
        System.out.println("Breakout Signal Days: " + breakoutDays);
    }
}