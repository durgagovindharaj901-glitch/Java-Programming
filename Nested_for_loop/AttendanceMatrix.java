import java.util.Scanner;
class AttendanceMatrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int students = scan.nextInt();
        int days = scan.nextInt();
        String[] stu_name = new String[students];
        String[][] status = new String[students][days];
        // double[] percentage = new double[students];
        
        int count = 0;

        for(int i = 0; i<days;i++){
            stu_name[i] = scan.nextLine();
            for(int j =0;j<days;j++){
                status[i][j] = scan.next();
            }
            
            for(int j=0;j<students;j++){
                int present = 0;
                for(int k =0;k<days;k++){
                    if(status.equals("P")){
                        present++;
                    }
                }
                double percentage = (present / days) * 100;
                if(percentage == 100.0){
                    count++;
                }
            }
            System.out.println("Attendance Matrix:");
            System.out.print("Student ");
            for(int d = 1;d<=days;d++){
                System.out.print("Day" + d + " ");
            }
            System.out.println("Attendance%");
                
            for(int n=0;n<students;n++){
                System.out.print(stu_name[n] + " ");
                for(int j =0 ;j<days;j++){
                    System.out.print(status[i][j] + " ");
                }
                System.out.printf("%.2f\n",percentage);
            }
        }
        System.out.printf("Perfect Attendance: %d Students\n",count);
    }
}