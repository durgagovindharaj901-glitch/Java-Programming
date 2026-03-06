import java.util.Scanner;
class Calendar{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int days = scan.nextInt();
        int startDay = scan.nextInt();

        System.out.println("Calendar Grid:");
        

        int total_cells = (startDay-1)+days;
        int currentDay = 1;
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 0; i<6;i++){
            for(int j =0;j<7;j++){
                int cellNo = (i*7)+j+1;

                if(cellNo < startDay){
                    System.out.println(" ");
                }
                
                else if(currentDay <= days){
                    System.out.printf("%4d",currentDay);
                    currentDay++;
                }
            }
            System.out.println();

            if(currentDay>days){
                break;
            }
        }

    }
}
