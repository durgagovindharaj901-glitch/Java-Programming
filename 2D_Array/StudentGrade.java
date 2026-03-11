import java.util.Scanner;
class StudentGrade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        int subject = scan.nextInt();
        int[][] grades = new int[student][subject];

        
        for(int i =0; i<student;i++){
            for(int j =0;j<subject;j++){
                grades[i][j] = scan.nextInt();
            }
        }
        System.out.println("Student Averages:");
        for(int i = 0;i<student;i++){
            double sum =0;
            for(int j = 0; j<subject;j++){
                sum += grades[i][j];
            }
            double average = sum/subject;
            System.out.printf("Student %d: %.0f%n",i+1,average * 100);
        }
        System.out.println("Subject Averages:");
        for(int j =0;j<subject;j++){
            double sum = 0;
            for(int i =0;i<student;i++){
                sum += grades[i][j];
            }
            double average = sum / student;
            System.out.printf("Subject %d: %.0f%n",j+1,average*100);
        }
    }
}
