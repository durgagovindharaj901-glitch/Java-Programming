import java.util.Scanner;
class MatrixMultiplication{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int r1 = scan.nextInt();
        int c1 = scan.nextInt();
        int[][] A = new int[r1][c1];
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                A[i][j] = scan.nextInt();
            }
        }
        int r2 = scan.nextInt();
        int c2 = scan.nextInt();
        int[][] B = new int[r2][c2];
        for(int i =0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                B[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix A:");
        for(int i =0;i<r1;i++){
            for(int j =0;j<c1;j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for(int i =0;i<r2;i++){
            for(int j = 0;j<c2;j++){
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        if(c1 != r2){
            System.out.println("Error: Cannot multiply, incompatible dimensions.");
            return;
        }
        int[][] result = new int[r1][c2];
        for(int i =0;i<r1;i++){
            for(int j =0;j<c2;j++){
                for(int k =0;k<c1;k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Resultant Matrix:");
        for(int i =0;i<r1;i++){
            for(int j =0;j<c2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}