import java.util.Scanner;
class RainFall{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int weeks = scan.nextInt();
        int days = scan.nextInt();
        int[][] rainfall = new int[weeks][days];
        for(int i =0; i< weeks;i++){
            for(int j = 0;j<days;j++){
                rainfall[i][j] = scan.nextInt();
            }
        }
        int[] weekTotal = new int[weeks];
        int monthTotal = 0;
        int dryWeek = 0;
        int minTotal = Integer.MAX_VALUE;

        for(int i =0;i<weeks;i++){
            int sum =0;
            for(int j = 0;j<days;j++){
                sum += rainfall[i][j];
            }
            weekTotal[i] = sum;
            monthTotal +=sum;

            if(sum < minTotal){
                minTotal = sum;
                dryWeek = i;
            }
        }
        System.out.println("Rainfall Data: ");
        for(int i =0;i<weeks;i++){
            for (int j = 0; j < days; j++) {
                System.out.print(rainfall[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nWeekly Totals:");
        for (int i = 0; i < weeks; i++) {
            System.out.println("Week " + (i+1) + ": " + weekTotal[i] + " mm");
        }
        System.out.println("\nMonthly Total: " + monthTotal + " mm");
        System.out.println("Driest Week: Week " + (dryWeek+1) + " (" + minTotal + " mm)");

    }
}