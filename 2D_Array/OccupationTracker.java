import java.util.Scanner;
import java.util.ArrayList;
class OccupationTracker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] seating = new int[rows][cols];
        int occupied = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                seating[i][j] = sc.nextInt();
                if(seating[i][j] == 1){
                    occupied++;
                }
            }
        }

        int totalSeats = rows * cols;
        int occupancyRate = (occupied * 100) / totalSeats;

        ArrayList<Integer> emptyRows = new ArrayList<>();
        for(int i = 0; i < rows; i++){
            int sum = 0;
            for(int j = 0; j < cols; j++){
                sum += seating[i][j];
            }
            if(sum == 0){
                emptyRows.add(i);
            }
        }
        System.out.println("Seating Map:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(seating[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nTotal Occupied: " + occupied);
        System.out.println("Occupancy Rate: "+occupancyRate);
        System.out.println("Empty Rows: " + emptyRows);
    }
}