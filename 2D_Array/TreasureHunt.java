import java.util.Scanner;
class TreasureHunt{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[][] map = new int[10][10];
        int T = scan.nextInt();
        for(int i =0;i<T;i++){
            int row = scan.nextInt();
            int col = scan.nextInt();
            map[row][col] = 1;
        }
        int C = scan.nextInt();
        for(int i = 0; i<C;i++){
            int checkR = scan.nextInt();
            int checkC = scan.nextInt();
            System.out.print("Checking Location (" + checkR + ", "+checkC + "): ");
            if(map[checkR][checkC] == 1){
                System.out.println("Treasure Found!");
                map[checkR][checkC] = 0;
            }else{
                System.out.println("No Treasure");
            }
        }
        System.out.println("Final Map:");
        printMap(map);
    }
    private static void printMap(int[][] map){
        for(int i = 0; i< map.length;i++){
            for(int j =0;j< map[i].length ;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}