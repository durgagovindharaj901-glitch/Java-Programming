import java.util.Scanner;
class SudokuValidator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int[][] grid = new int[9][9];
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                grid[i][j] = scan.nextInt();
            }
        }
        for(int i =0;i<9;i++){
            for(int j =0;j<9;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        boolean valid = true;
        for(int i =0;i<9;i++){
            boolean[] seen = new boolean[10];
            for(int j= 0; j<9;j++){
                int val = grid[i][j];
                if(val!= 0){
                    if(seen[val]) valid = false;
                    seen[val] = true;
                }
            }
        }
        for(int j =0;j<9;j++){
            boolean[] seen = new boolean[10];
            for(int i= 0; i<9;i++){
                int val = grid[i][j];
                if(val!= 0){
                    if(seen[val]) valid = false;
                    seen[val] = true;
                }
            }
        }
        if(valid){
            System.out.println("Status: Valid Solution");
        }
        else{
            System.out.println("Status: Invalid Solution");
        }
    }
}