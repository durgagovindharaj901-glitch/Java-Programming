import java.util.Scanner;
class Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double totalDistance = 0;
        double totalRevenue = 0;

        for (int i = 1; i <= N; i++) {
            double km = sc.nextDouble();
            String time = sc.next();

            double base = 3.0;
            double distCharge = km;
            double surcharge = 0;

            if (time.equals("Evening")) surcharge = 3;
            else if (time.equals("Night")) surcharge = 5;

            double total = base + distCharge + surcharge;

            totalDistance += km;
            totalRevenue += total;

            System.out.println("Ride " + i);
            System.out.println("Distance: " + km + " km");
            System.out.println("Time: " + time);
            System.out.println("Base Fare: $" + base);
            System.out.println("Distance Charge: $" + distCharge);
            System.out.println("Time Surcharge: $" + surcharge);
            System.out.println("Total Fare: $" + total);

        }

        double avg = totalRevenue / N;

        System.out.println();
        System.out.println("Total Rides: " + N);
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.println("Average Fare: $" + avg);
    }
}