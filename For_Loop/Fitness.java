import java.util.Scanner;
class Fitness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int totalDuration = 0;
        int totalCalories = 0;

        for (int i = 1; i <= N; i++) {
            String type = sc.next();
            int minutes = sc.nextInt();

            int rate = 0;
            String intensity = "";

            switch (type) {
                case "Running": rate = 10; intensity = "High"; break;
                case "Swimming": rate = 12; intensity = "High"; break;
                case "Cycling": rate = 8; intensity = "Moderate"; break;
                case "Gym": rate = 7; intensity = "Moderate"; break;
                case "Walking": rate = 4; intensity = "Low"; break;
            }

            int calories = rate * minutes;

            totalDuration += minutes;
            totalCalories += calories;

            System.out.println("Session " + i + ": " + type);
            System.out.println("Duration: " + minutes + " minutes");
            System.out.println("Calories Burned: " + calories);
            System.out.println("Intensity: " + intensity);

            if (i != N)
                System.out.println();
        }

        double avg = totalCalories / (double) N;

        String level;
        if (totalCalories < 300) level = "Beginner";
        else if (totalCalories <= 1000) level = "Intermediate";
        else level = "Advanced";

        System.out.println();
        System.out.println("Total Workouts: " + N);
        System.out.println("Total Duration: " + totalDuration + " minutes");
        System.out.println("Total Calories Burned: " + totalCalories);
        System.out.println("Average Calories per Session: " + avg);
        System.out.println("Fitness Level: " + level);
    }
}