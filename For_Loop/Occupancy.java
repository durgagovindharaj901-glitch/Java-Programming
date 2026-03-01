import java.util.Scanner;
class Occupancy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double totalRate = 0;
        int peakDay = 0;
        double maxRate = 0;
        int fullDays = 0;

        for (int i = 0; i < N; i++) {
            int day = sc.nextInt();
            int occupied = sc.nextInt();
            int totalRooms = sc.nextInt();

            double rate = (occupied * 100.0) / totalRooms;
            totalRate += rate;

            if (rate > maxRate) {
                maxRate = rate;
                peakDay = day;
            }
            if (rate == 100.0){
                 fullDays++;
            }
               
            String status;
            if (rate == 100.0){
                status = "Full";
            }else if (rate >= 85){
                status = "High";
            }else if (rate >= 70){
                status = "Moderate";
            }else{
                status = "Low";
            }
            System.out.println("Day: " + day);
            System.out.println("Rooms Occupied: " + occupied);
            System.out.println("Total Rooms: " + totalRooms);
            System.out.println("Occupancy Rate: " + rate + "%");
            System.out.println("Status: " + status);

            if (i != N - 1)
                System.out.println();
        }

        double avgRate = totalRate / N;
        System.out.println();
        System.out.println("Total Days Analyzed: " + N);
        System.out.printf("Average Occupancy Rate: %.2f%%\n", avgRate);
        System.out.println("Peak Occupancy Day: Day " + peakDay);
        System.out.println("Days at Full Capacity: " + fullDays);
    }
}