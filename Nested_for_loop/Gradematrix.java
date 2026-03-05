import java.util.Scanner;
class Gradematrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int student = scan.nextInt();
        int sub = scan.nextInt();

        String stu_name;
        int score;
        
        System.out.println("Grade Sheet:");
        System.out.printf("%-10s","Student");

        for(int j = 1;j<=sub;j++){
            System.out.printf("Sub%d ",j);
        }
        System.out.printf("Average\n");

        for(int i = 1;i<student;i++){
            int sum = 0;
            stu_name = scan.next();

            System.out.printf("%-10s\n",stu_name);

            for(int j=1;j<=sub;j++){
                score = scan.nextInt(); 
                sum +=score;
                System.out.printf("%-5d",score);
            }
            double average = (double) sum / sub;
            System.out.printf("%.2f\n",average);
        }
        
    }
}