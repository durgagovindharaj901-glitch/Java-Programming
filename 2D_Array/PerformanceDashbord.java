import java.util.Scanner;
class PerformanceDashbord{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        int[][] data = new int[row][col];

        
        for(int i = 0; i<row;i++){
            for(int j=0;j<col;j++){
                data[i][j] = scan.nextInt();
            }
        }
        System.out.println("Sales Data:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < class; j++){
                System.out.print(sales[i][j] + " ");
            }
            System.out.println();
        }
        int bestProductIndex = -1;
        int maxSales = Integer.MIN_VALUE;

        for(int i = 0; i < numProducts; i++){
            int total = 0;
            for(int j = 0; j < numRegions; j++){
                total += sales[i][j];
            }
            System.out.println("Product " + (i + 1) + ": " + total);

            if(total > maxSales){
                maxSales = total;
                bestProductIndex = i;
            }
        }
        System.out.println("\nBest-Selling Product: Product " + (bestProductIndex + 1) 
                           + " with " + maxSales + " units");


    }
}