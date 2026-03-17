import java.util.Scanner;
class SpiralMatrix{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] matrix = new int[row][col];
        for(int i = 0;i<row;i++){
            for(int j =0;j<col;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.println(matrix[i][j]);
            }
        }
        System.out.println("Spiral Order:");
        int top = 0;
        int left = 0;
        int bottom = row -1;
        int right = col - 1;
        while(top<=bottom && )
    }
}