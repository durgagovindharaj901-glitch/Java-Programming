import java.util.Scanner;
class GradePerformance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] grades = new int[n];

        for(int i = 0; i < n; i++){
            grades[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int failed = 0;

        for(int i = 0; i < n; i++){
            if(grades[i] > max){
                max = grades[i];
            }
            if(grades[i] < min){
                min = grades[i];
            }
            if(grades[i] < 40){
                failed++;
            }
        }

        int passed = n - failed;
        double passPercentage = (passed * 100.0) / n;

        System.out.println("Total Students: " + n);
        System.out.println("Highest Grade: " + max);
        System.out.println("Lowest Grade: " + min);
        System.out.println("Failed Students: " + failed);
        System.out.printf("Pass Percentage: %.2f", passPercentage);
    }

}
