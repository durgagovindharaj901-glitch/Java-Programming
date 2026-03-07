import java.util.Scanner;
class Transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int original[][] = new int[rows][cols];
        int transpose[][] = new int[cols][rows];

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                original[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                transpose[j][i] = original[i][j];
            }
        }

        System.out.println("\nOriginal Matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.printf("%4d", original[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nTranspose Matrix:");
        for(int i = 0; i < cols; i++) {
            for(int j = 0; j < rows; j++) {
                System.out.printf("%4d", transpose[i][j]);
            }
            System.out.println();
        }

    }
}