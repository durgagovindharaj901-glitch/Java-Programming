import java.util.Scanner;
class GridAnalyzer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] tempGrid = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                tempGrid[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nTemperature Grid:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(tempGrid[i][j] + " ");
            }
            System.out.println();
        }
        int max = tempGrid[0][0];
        int min = tempGrid[0][0];
        int maxRow = 0, maxCol = 0;
        int minRow = 0, minCol = 0;
        int sum = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                int val = tempGrid[i][j];
                sum += val;

                if(val > max){
                    max = val;
                    maxRow = i;
                    maxCol = j;
                }
                if(val < min){
                    min = val;
                    minRow = i;
                    minCol = j;
                }
            }
        }
        double average = (double) sum / (rows * cols);
        System.out.println("\nMaximum Temperature: " + max + "°C at position (" + maxRow + ", " + maxCol + ")");
        System.out.println("Minimum Temperature: " + min + "°C at position (" + minRow + ", " + minCol + ")");
        System.out.println("Average Temperature: " + average + "°C");
    }
}