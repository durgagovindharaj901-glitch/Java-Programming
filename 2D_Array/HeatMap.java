import java.util.Scanner;
class HeatMap{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] grid = new int[row][col];

        int total =0;
        int max = -1;
        int maxRow = 0;
        int maxCol = 0;

        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                grid[i][j] = scan.nextInt();
            }
        }
        System.out.println("Inventory Grid:");
        for(int i =0;i<row;i++){
            for(int j= 0;j<col;j++){
                System.out.print(grid[i][j] + " ");
                total += grid[i][j];
                if(grid[i][j] > max){
                    max = grid[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
            System.out.println();
        }
        int average = int total / (row * col);

        System.out.println("Total Inventory: "+total);
        System.out.println("Max Stock Zone: Row "+ (maxRow + 1)+ ", Col "+ "(" + max + " units)");
        System.out.println("Average Stock per Zone: "+average);
    }
}