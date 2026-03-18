import java.util.Scanner;
class GridIsland{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] grid = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                grid[r][c] = sc.nextInt();
            }
        }

        System.out.println("Map:");
        for (int[] row : grid) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        int count = numIslands(grid);
        System.out.println("\nNumber of Islands: " + count);
    }

    public static int numIslands(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 1) {
                    islands++;
                    dfs(grid, r, c);
                }
            }
        }
        return islands;
    }

    private static void dfs(int[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == 0) {
            return;
        }

        grid[r][c] = 0; 

        dfs(grid, r - 1, c); 
        dfs(grid, r + 1, c); 
        dfs(grid, r, c - 1);
        dfs(grid, r, c + 1); 
    }
}