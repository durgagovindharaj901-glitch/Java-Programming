import java.util.Scanner;
class Matrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int seatsPerRow = scan.nextInt();
        int count = 0;
        for(int i = 1;i<=row;i++){
            for(int j = 1;j<=seatsPerRow;j++){
                if(j==1){
                    System.out.printf("Row %d: Seat-%d ",i,j);
                }else{
                    System.out.printf("Seat-%d ",j);
                }
                
                count++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Total Seats: "+count);
    }
}

