import java.util.Scanner;
class ElevationMap{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int col = scan.nextInt();
        double[][] metre = new double[row][col];
        for(int i =0;i<row;i++){
            for(int j = 0; j<col;j++){
                metre[i][j] = scan.nextDouble();
            }
        }
        System.out.println("Elevation Map:");
        for(int i = 0; i<row;i++){
            for(int j = 0; j<col;j++){
                System.out.print(metre[i][j] + " ");
            }
            System.out.println();
        }
        double max = Double.NEGATIVE_INFINITY ;
        double min = Double.POSITIVE_INFINITY;
        for(int i =0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(metre[i][j] > max){
                   max = metre[i][j]; 
                }
                if(metre[i][j] < min){
                   min = metre[i][j]; 
                }
                
            }
        }
        int highest = (int)Math.round(max);
        int lowest = (int)Math.round(min);
        int range = highest - lowest;
        System.out.println("Highest Point: "+highest + " m");
        System.out.println("Lowest Point: "+lowest + " m");
        System.out.println("Elevation Range: "+range + " m");
    }
}