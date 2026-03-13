import java.util.Scanner;
class Brightness{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int width = scan.nextInt();
        int brightness = scan.nextInt();

        int[][] image = new int[height][width];
        for(int i = 0;i<height;i++){
            for(int j =0;j<width;j++){
                image[i][j] = scan.nextInt();
            }
        }
        System.out.println("Original Image:");
        for(int i = 0; i<height;i++){
            for(int j = 0; j<width;j++){
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Adjusted Image: ");
        for(int i = 0; i<height;i++){
            for(int j = 0; j<width;j++){
                int newPixel = image[i][j] + brightness;
                newPixel = Math.min(255, Math.max(0, newPixel));
                System.out.print(newPixel + " ");
            }
            System.out.println();
        }
    }
}