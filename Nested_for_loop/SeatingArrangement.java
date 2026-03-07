import java.util.Scanner;
class SeatingArrangement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int totalStudents = sc.nextInt();
        
        int totalSeats = rows * cols;
        int studentNum = 1;
        int occupied = 0;
        int empty = 0;

        System.out.println("\nSeating Arrangement:");

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if ((row + col) % 2 == 0) {
                    String id = "S" + String.format("%03d", studentNum);
                    System.out.printf("%-6s", id);
                    studentNum++;
                    occupied++;
                } else {
                    System.out.printf("%-6s", "----");
                    empty++;
                }
            }
            System.out.println();
        }

        System.out.println("\nTotal seats: " + totalSeats);
        System.out.println("Occupied seats: " + occupied);
        System.out.println("Empty seats: " + empty);
    }
}