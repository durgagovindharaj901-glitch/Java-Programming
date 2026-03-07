import java.util.Scanner;
class Pascal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int[][] value = new int[rows][rows];
        for (int row = 0; row < rows; row++) {
            for (int s = 0; s < rows - row - 1; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {

                if (col == 0 || col == row) {
                    value[row][col] = 1;
                } else {
                    value[row][col] = value[row - 1][col - 1] + value[row - 1][col];
                }

                System.out.print(value[row][col] + " ");
            }

            System.out.println();
        }
    }
}