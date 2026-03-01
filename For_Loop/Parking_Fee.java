import java.util.Scanner;
class Parking_Fee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        double totalRevenue = 0;
        int peak = 0;

        for (int i = 1; i <= N; i++) {
            String type = sc.next();
            double hours = sc.nextDouble();

            double rate = 0, cap = 0;
            if (type.equals("Car")) { rate = 3; cap = 30; }
            else if (type.equals("Motorcycle")) { rate = 2; cap = 20; }
            else if (type.equals("Truck")) { rate = 5; cap = 60; }
            else { rate = 7; cap = 100; }

            double calc = hours * rate;
            double fee = Math.min(calc, cap);

            if (hours > 8) peak++;
            totalRevenue += fee;

            System.out.println("Vehicle " + i + ": " + type);
            System.out.println("Hours Parked: " + hours);
            System.out.println("Hourly Rate: $" + rate);
            System.out.println("Parking Fee: $" + fee);
            System.out.println("Cap Applied: " + (calc > cap ? "Yes" : "No"));

        }

        double avg = totalRevenue / N;

        System.out.println();
        System.out.println("Total Vehicles: " + N);
        System.out.println("Total Revenue: $" + totalRevenue);
        System.out.printf("Average Fee: %.2f\n", avg);
        System.out.println("Peak Hour Vehicles (>8 hours): " + peak);
    }
}