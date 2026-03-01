import java.util.Scanner;
class Blood{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int eligible = 0;

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            int age = sc.nextInt();
            double weight = sc.nextDouble();
            double hb = sc.nextDouble();

            boolean ok = true;
            String reason = "";

            if (age < 18) { ok = false; reason = "Age below 18 years"; }
            else if (age > 65) { ok = false; reason = "Age above 65 years"; }
            else if (weight < 50) { ok = false; reason = "Weight below 50 kg"; }
            else if (hb < 12.5) { ok = false; reason = "Hemoglobin below 12.5 g/dL"; }

            System.out.println("Donor: " + name);
            System.out.println("Age: " + age + " years");
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Hemoglobin: " + hb + " g/dL");

            if (ok) {
                eligible++;
                System.out.println("Status: Eligible");
            } else {
                System.out.println("Status: Not Eligible");
                System.out.println("Reason: " + reason);
            }

        }

        int rejected = N - eligible;
        double rate = eligible * 100.0 / N;

        System.out.println();
        System.out.println("Total Donors: " + N);
        System.out.println("Eligible Donors: " + eligible);
        System.out.println("Rejected Donors: " + rejected);
        System.out.printf("Eligibility Rate: %.2f%\n", rate);
    }
}