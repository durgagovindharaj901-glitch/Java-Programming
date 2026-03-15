import java.util.Scanner;
import java.util.ArrayList;
class SocialDistanceValidator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();

        int[][] layout = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                layout[i][j] = scan.nextInt();
            }
        }
        int[][] directions = {
            {-1,-1}, {-1,0}, {-1,1},
            {0,-1},          {0,1},
            {1,-1},  {1,0},  {1,1}
        };


        ArrayList<String> violations = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (layout[i][j] == 1) {
                    for (int[] d : directions) {
                        int ni = i + d[0];
                        int nj = j + d[1];
                        if (ni >= 0 && ni < row && nj >= 0 && nj < col) {
                            if (layout[ni][nj] == 1) {
                                violations.add("Seat at (" + i + ", " + j + 
                                               ") is too close to (" + ni + ", " + nj + ")");

                            }
                        }
                    }
                }
            }
        }
        System.out.println("Seating Layout:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println(layout[i][j]);
            }
        }

        System.out.println("\nViolations Found: " + violations.size());
        System.out.println("Violation Coordinates: " + violations);
        System.out.println("Status: " + (violations.isEmpty() ? "Compliant" : "Non-Compliant"));

    }
}