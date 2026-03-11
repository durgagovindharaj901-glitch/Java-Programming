import java.util.Scanner;
class MatrixAddition{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int [][]matrixA = new int[row][col];
        int [][]matrixB = new int[row][col];
        int [][]result = new int[row][col];

        System.out.println("Matrix A: ");
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                matrixA[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix B: ");
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                matrixB[i][j] = scan.nextInt();
            }
        }
        System.out.println("Sum Matrix: ");    
        for(int i = 0;i<row;i++){
            for(int j=0;j<col;j++){
                result[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(result[i][j] + " "); 
            }
            System.out.println();
        }
    }
}