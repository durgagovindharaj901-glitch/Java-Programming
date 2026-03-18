import java.util.Scanner;
class MagicSquare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] matrix = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        if (isMagicSquare(matrix, N)) {
            System.out.println("\nResult: Magic Square");
        } else {
            System.out.println("\nResult: Not a Magic Square");
        }
    }

    public static boolean isMagicSquare(int[][] arr, int N) {
        int target = 0;
        for (int j = 0; j < N; j++) {
            target += arr[0][j];
        }

        for (int i = 1; i < N; i++) {
            int rowSum = 0;
            for (int j = 0; j < N; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum != target) return false;
        }

        for (int j = 0; j < N; j++) {
            int colSum = 0;
            for (int i = 0; i < N; i++) {
                colSum += arr[i][j];
            }
            if (colSum != target) return false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < N; i++) {
            diag1 += arr[i][i];
            diag2 += arr[i][N - 1 - i];
        }
        if (diag1 != target || diag2 != target) return false;

        return true;
    }
}