import java.util.Scanner;
class ParkGrid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        boolean[][] spot = new boolean[rows][cols];
        int occupied = sc.nextInt();

        for (int i = 0; i < occupied; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            spot[r][c] = true;
        }
        System.out.println("\nParking Lot Status:");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (spot[row][col]) {
                    System.out.print("[O]");
                } else {
                    System.out.print("[ ]");
                }
            }
            System.out.println();
        }
        int total = rows * cols;
        int vacant = total - occupied;
        double rate = (occupied * 100.0) / total;

        System.out.println("\nTotal spots: " + total);
        System.out.println("Occupied: " + occupied);
        System.out.println("Vacant: " + vacant);
        System.out.println("Occupancy Rate: " + rate +"0" + "%");
    }
}