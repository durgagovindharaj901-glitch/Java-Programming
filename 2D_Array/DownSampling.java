import java.util.Scanner;

class ImageCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] image = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Image:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }

        int newSize = n / 2;
        int[][] compressed = new int[newSize][newSize];

        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {

                int sum = image[2*i][2*j] +
                          image[2*i][2*j+1] +
                          image[2*i+1][2*j] +
                          image[2*i+1][2*j+1];

                compressed[i][j] = sum / 4;
            }
        }

        System.out.println("\nCompressed Image:");
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                System.out.print(compressed[i][j] + " ");
            }
            System.out.println();
        }
    }
}