import java.util.Scanner;
class HollowRect{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width = sc.nextInt();

        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= width; col++) {
                if (row == 1 || row == height || col == 1 || col == width) {
                    System.out.print("*");
                } 
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}