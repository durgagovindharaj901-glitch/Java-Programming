import java.util.Scanner;
class SalesCalculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int reps = scan.nextInt();
        int territories = scan.nextInt();
        int[][] sales = new int[reps][territories];

        for(int i =0;i<reps;i++){
            for(int j = 0;j<territories;j++){
                sales[i][j] = scan.nextInt();
            }
            
        }
        System.out.println("Sales matrix: ");
        for(int i =0;i<reps;i++){
            for(int j = 0; j<territories;j++){
                System.out.println(sales[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Representative Totals: ");
        
        for(int i = 0; i<reps ;i++){
            int repssum = 0;
            for(int j= 0;j<territories;j++){
                repssum += sales[i][j];
            }
            System.out.println("Rep " + (i+1) + ": " +repssum);
        }
        System.out.println("Territory Totals: ");
        
        for(int j = 0; j<territories ;j++){
            int territorysum = 0;
            for(int i= 0;j<reps;i++){
                territorysum += sales[i][j];
            }
            System.out.println("Territory " + (j+1) + ": " +territorysum);
        }
    }
}