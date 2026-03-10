import java.util.Scanner;
class CourseCompletion{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] completion = new int[n];
        for(int i = 0; i < n; i++){
            completion[i] = sc.nextInt();
        }

        double sum = 0.0;
        int maxComplete = Integer.MIN_VALUE;
        int minComplete = Integer.MAX_VALUE;
        int maxIndex = -1, minIndex = -1;
        int riskCount = 0;
        for(int i = 0; i < n; i++){
            int value = completion[i];
            sum = sum +value;

            if(value > maxComplete){
                maxComplete = value;
                maxIndex = i + 1; 
            }
            if(value < minComplete){
                minComplete = value;
                minIndex = i + 1;
            }
            if(value < 60){
                riskCount++;
            }
        }

        double average = sum / n;
        double successRate = ((double)(n - riskCount) / n) * 100;
        System.out.println("Total Students: " + n);
        System.out.printf("Average Completion: %.2f%%%n", average);
        System.out.println("Highest Completion: " + maxComplete + "% (Student " + maxIndex + ")");
        System.out.println("Lowest Completion: " + minComplete + "% (Student " + minIndex + ")");
        System.out.println("At-Risk Students (<60%): " + riskCount);
        System.out.printf("Success Rate: %.2f%%%n", successRate);
    }
}