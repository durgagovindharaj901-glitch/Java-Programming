import java.util.Scanner;
class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   

        int totalScore = 0;
        int highestScore = 0;
        int passCount = 0;
        int failCount = 0;

        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int score = sc.nextInt();

            totalScore = totalScore + score;

            if (score > highestScore) {
                highestScore = score;
            }

            char grade;
            if (score >= 90) {
                grade = 'A';
            } else if (score >= 75) {
                grade = 'B';
            } else if (score >= 60) {
                grade = 'C';
            } else {
                grade = 'D';
            }

            String status;
            if (score >= 60) {
                status = "Pass";
                passCount++;
            } else {
                status = "Fail";
                failCount++;
            }

            System.out.println("Student: " + name);
            System.out.println("Score: " + score);
            System.out.println("Letter Grade: " + grade);
            System.out.println("Status: " + status);

            // if (i < n - 1) {
            //     System.out.println();
            // }
        }

        double average = (double) totalScore / n;

        System.out.println("Total Students: " + n);
        System.out.printf("Class Average: %.2f%n", average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Students Passed: " + passCount);
        System.out.println("Students Failed: " + failCount);
    }
}