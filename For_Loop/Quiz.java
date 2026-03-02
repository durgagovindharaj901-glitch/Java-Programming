import java.util.Scanner;
class Quiz{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println();
        int N = scan.nextInt();

        int passCount = 0;
        int failCount = 0;
        int highestScore = 0;
        int totalScore = 0;
        int score;
        String result;

        for(int i = 1; i <= N;i++){
            System.out.print("Student:"+i);
            String studentName = scan.nextLine();
            scan.nextLine();
            System.out.print("Correct:");
            int correctAnswers = scan.nextInt();
            System.out.print("Wrong:");
            int wrongAnswers = scan.nextInt();
            System.out.print("Unattempted:");
            int unattempted = scan.nextInt();

            scan.nextLine();
            score = (correctAnswers * 4) - (wrongAnswers * 3) + (unattempted * 0);
            System.out.println("Score:"+score);

            if(score >= 32){
                System.out.println("Result : Pass");
                passCount++;
            }
            else{
                System.out.println("Result : Fail");
                failCount++;
            }
            highestScore = Math.max(highestScore, score);
            totalScore += score;
            
        } 
        double average = (double) totalScore / N;
    
        System.out.println("Total Students:"+N);
        System.out.println("Pass Count:"+passCount);
        System.out.println("Fail Count:"+failCount);
        System.out.println("Class Average:"+average);
        System.out.println("Highest Score:"+highestScore);
    }
}