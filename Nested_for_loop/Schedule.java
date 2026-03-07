import java.util.Scanner;
class Schedule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int periods = sc.nextInt();
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[][] timetable = new String[days][periods];

        for (int i = 0; i < days; i++) {
            System.out.println("Enter subjects for " + dayNames[i] + ":");
            for (int j = 0; j < periods; j++) {
                System.out.print("Period " + (j + 1) + ": ");
                timetable[i][j] = sc.nextLine();
            }
        }

        System.out.printf("%-12s", "Day");
        for (int j = 0; j < periods; j++) {
            System.out.printf("P%-6d", (j + 1));
        }
        System.out.println();

        for (int i = 0; i < days; i++) {
            System.out.printf("%-12s", dayNames[i]); 
            for (int j = 0; j < periods; j++) { 
                System.out.printf("%-7s", timetable[i][j]);
            }

            System.out.println();
        }
    }
}