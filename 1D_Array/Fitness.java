import java.util.Scanner;
class Fitness{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        
        int n = sc.nextInt();
        int[] calories = new int[n];
        for(int i = 0; i < n; i++){
            calories[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        int total = 0;
        int maxBurn = Integer.MIN_VALUE;
        int peakDay = -1;
        int belowTargetCount = 0;

        for(int i = 0; i < n; i++){
            total += calories[i];
            if(calories[i] > maxBurn){
                maxBurn = calories[i];
                peakDay = i + 1;
            }
            if(calories[i] < target){
                belowTargetCount++;
            }
        }

        double average = (double) total / n;
        double achievement = ((double)(n - belowTargetCount) / n) * 100;
        System.out.println("Days Tracked: " + n);
        System.out.println("Total Calories Burned: " + total);
        System.out.printf("Average Daily Burn: %.2f%n", average);
        System.out.println("Peak Burn Day: Day " + peakDay + " (" + maxBurn + " calories)");
        System.out.println("Days Below Target: " + belowTargetCount);
        System.out.printf("Goal Achievement: %.2f%%%n", achievement);
    }
}