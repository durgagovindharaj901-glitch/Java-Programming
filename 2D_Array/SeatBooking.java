import java.util.Scanner;
class SeatBooking{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int booked = scan.nextInt();

        char[][] seats = new char[row][col];
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                seats[i][j] = 'A';
            }
        }
        for(int b =0;b<booked;b++){
            int r = scan.nextInt();
            int c = scan.nextInt();
            seats[r][c] = 'B';
        }
            int count = 0;
            for(int i = 0; i<row;i++){
                for(int j =0;j<col;j++){
                    System.out.print(seats[i][j] + " ");
                    if(seats[i][j] == 'B'){
                        count++;
                    }
                }
                System.out.println();
            }
        int totalSeats = row * col;
        int available = totalSeats - count;
        int rate = (count * 100) / totalSeats;

        System.out.println("Total Seats: "+totalSeats);
        System.out.println("Booked seats: "+count);
        System.out.println("Available Seats: "+available);
        System.out.println("Occupancy Rate: "+rate+"00%");
    }
}
